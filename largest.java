import java.util.*;
public class largest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5; arr[1] = 1; arr[2] = 2; arr[3] = 7; arr[4] = 0;
		
		int k = 2;
		sort(arr, 0, arr.length - 1, k);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	public static void sort(int[] arr, int left, int right, int k) {
		if(k == 0 || left >= right) {
			return;
		} 
		int pivot = arr[arr.length - 1];
		int lPointer = left;
		int rPointer = right;
		while(lPointer < rPointer) {
			while(arr[lPointer] <= pivot && lPointer < rPointer) {
				lPointer++;
			}
			while(arr[rPointer] >= pivot && lPointer < rPointer) {
				rPointer--;
			}
			int temp = arr[lPointer];
			arr[lPointer] = arr[rPointer];
			arr[rPointer] = temp;
		}
		int temp = arr[lPointer];
		arr[lPointer] = pivot;
		arr[right] = temp;
		k--;
		sort(arr,0,right, k);
		
	}
	
	
	
	
	
}
