
public class Sort {
	
	public void quickSort(int[] arr, int l, int r) {
		partition(arr,l,r);
		//arrange(arr,l,r);
	}
	private void partition(int[] arr, int l, int r) {
		//have a base case if the arr that is returned is of size 1 or if l is greater than r,
		//meaning that there is nothing to evaluate.
		if(l >= r) {
			return;
		}
		
		int low = l;
		int high = r;
		int pivot = arr[r];
		while(l < r) {
			while(arr[l] <= pivot && l < r) {
				l++;
			}
			while(arr[r] >= pivot && l < r) {
				r--;
			}
			//swap once we break out of those 2 inner while loops
			swap(arr,l,r);
		}
		//swap where l and r are point at with the pivot
		swap(arr,l,high);
		//now call the left and right sub arrays to repeat this process
		quickSort(arr, low, l - 1); //left side
		quickSort(arr, l+1, high); //right side
		
		
	}
	private void swap(int[] arr, int index1, int index2) {
		int temp = arr[index2];
		arr[index2] = arr[index1];
		arr[index1] = temp;
	}
	
	public void arrange(int[] arr, int l, int r) {
		if(l >= r) {
			return;
		}
		int low = l;
		int high = r;
		int pivot = arr[r];
		while(l < r) {
			while(arr[l] <= pivot && l < r) {
				//keep moving along the list until we find a left value greater than pivot
				l++;
			}
			while(arr[r]>= pivot && l < r) {
				//keep moving down the list from right to left until we find a value smaller than pivot
				r--;
			}
			//once 2 values are found from left side and right side, swap them appropriatly.
			//we want to swap the values. because left val > right val. we want to swap them
			swap(arr, l, r);
		}
		//once we are finally done, L and R will be pointing to the same value in the array. Now that everything is sorted in that
		//initial call, we want to swap the value that is being pointed at by L and R with the pivot. Since we know that the
		//pointed value will be larger than the pivot. The pivot will then be done. Now we will need a new pivot, from the left and right
		//sub arrays. Example: [5,3,2,8,9,7] ---> pivot = 7, after the initial call, we will get [5,3,2,7,9,8] 
		//we can see that 7 will be flipped with 8. everything to the left of 7 is smaller and everything to the right of 7 is larger.
		//then we will repeat this process by calling the same method for the left sub array [5,3,2] and the right subarray [9,8]
		//the 7 will no longer be in play, since it is in the right place from the initial sort that used the 7 as the pivot.
		swap(arr,l,high);
		
		arrange(arr,low, l-1); //the left subarray not including the pivot.
		arrange(arr, l+1, high); // the right subarray not including the pivot.
		
	}
	public static void main(String[] args) {
		Sort s = new Sort();
		int[] arr = {1,2,1,55,13};
		s.quickSort(arr,0, arr.length - 1);
		System.out.println("idjfsdijfds");
	}
}
