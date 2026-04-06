package com.codegnan11032026.binarysearch;

public class BinarySearch {
	public static void binarySearch(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==target) {
				System.out.println("Found at :" + mid);
				return;
			}else if(arr[mid]>target) {
				right = mid -1;
			}else {
				
				left = mid +1;
			}
		}
		System.out.println("Not found");
		
	}
	public static void main(String[] args) {
		int arr[] = {3,7,8,9,11,14};
		binarySearch(arr, 15);
	}

}
