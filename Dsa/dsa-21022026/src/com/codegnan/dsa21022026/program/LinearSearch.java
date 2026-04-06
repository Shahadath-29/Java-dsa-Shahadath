package com.codegnan.dsa21022026.program;

public class LinearSearch {
	public int linearSearch(int arr[] , int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.print("Index of Target Element is "+ i);
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		int arr[]= {2,3,5,7,9};
		obj.linearSearch(arr, 7);
		
	}
	/*public static void main(String[] args) {
		int arr[] = {2,3,5,7,9};
		int target = 7;
		
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.print("Index of Target Element is "+ i);
			}
		}
	}*/

}
