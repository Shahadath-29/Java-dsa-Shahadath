package com.codegnan.dsa24022026.sorting;

public class SortByLength {
	public static void printArray(String arr[] ) {
		for(String str : arr) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		
		String arr [] = {"bahubali", "devasena", "balla","shiva"};
		System.out.println("Before Sorting...");
		printArray(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].length()>arr[j+1].length()) {
					String temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting...");
		printArray(arr);
	}

}
