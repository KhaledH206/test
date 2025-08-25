import java.util.*;
public class search {
	//binary search
	public int find(int[] arr, int target) {
		int left = 0; int right =arr.length - 1;
		while(left <= right) {
			int mid = (right + left) / 2;
			if(arr[mid] > target) {
				right = mid - 1;
			}else if(arr[mid] < target){
				left = mid + 1;
			}else if(arr[mid] == target){
				return mid;
			}	
		}
		return -1; //if target is not in array
		
	}
	//bubble sort
	public void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {// reason we add the - i is because the biggest element for each loop will be pushed to the end
														 // of the list, so no need to keep going all the way to the end for every loop.
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public int s(int[] arr, int target, int l, int r) {
		if(l <= r) {
			int mid = (l + r) / 2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				r = mid - 1;
				return s(arr, target,l,r);
			}else if(arr[mid] < target) {
				l = mid + 1;
				return s(arr, target, l,r);
			}
		}
		return -1;
	}
	
}
//Binary search algo 