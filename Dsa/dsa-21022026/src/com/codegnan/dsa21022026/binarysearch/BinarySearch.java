package com.codegnan.dsa21022026.binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		int target = 50;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			int mid = (low + high)/2;
			if(target == arr[mid]) {
				System.out.println("Element Found at: " + mid);
				return;
			}else if(target>arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		System.out.println("Not found");
		
	}

}
