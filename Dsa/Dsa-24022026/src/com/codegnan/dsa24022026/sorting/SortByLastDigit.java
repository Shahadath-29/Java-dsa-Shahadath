package com.codegnan.dsa24022026.sorting;

public class SortByLastDigit {
	public static void printArray(int arr[] ) {
		for(int Array : arr) {
			System.out.println(Array);
		}
	}
	public static void main(String[] args) {
		
		int arr [] = {23,49,22,36,26};
		System.out.println("Befor Sorting:");
		printArray(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				int last1 = arr[j]%10;
				int last2 = arr[j+1]%10;
				if(last1>last2 || (last1==last2) && arr[j]>arr[j+1]) {
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
