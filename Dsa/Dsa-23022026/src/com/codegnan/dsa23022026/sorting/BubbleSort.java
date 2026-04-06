package com.codegnan.dsa23022026.sorting;

import java.util.Arrays;

public class BubbleSort {
	public  void bubblesort(int arr[]) {
		boolean swapped;
		for(int i=0;i<arr.length-1;i++) {
			swapped = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped=true;
				}
			}
			if(!swapped) break;
		}
		
	}
	
	public static void main(String[] args) {
		BubbleSort bubblesort = new BubbleSort();
		int arr[] = {12,11,14,17,16};
		bubblesort.bubblesort(arr);
		System.out.println(Arrays.toString(arr));
		
	
	
		/*public static void bubblesort(int arr[]) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j+1] = arr[j];
						arr[j+1] = temp;
					}
				}
			}
		}
		
		public static void main(String[] args) {
			int arr[] = {12,65,85,14,32};
			BubbleSort.bubblesort(arr);
			System.out.println(Arrays.toString(arr));*/
			
		
	}

}
