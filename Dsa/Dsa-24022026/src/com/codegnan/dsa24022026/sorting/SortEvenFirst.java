package com.codegnan.dsa24022026.sorting;

public class SortEvenFirst {
	public static void printArray(int arr[] ) {
		for(int Array : arr) {
			System.out.println(Array);
		}
	}
	public static void main(String[] args) {
		
		int arr [] = {23,56,22,33,26,51};
		System.out.println("Befor Sorting:");
		printArray(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
					if((arr[j]%2)>arr[j+1]%2) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}
			}
		System.out.println("After Sorting");
		printArray(arr);
		
	}

}
