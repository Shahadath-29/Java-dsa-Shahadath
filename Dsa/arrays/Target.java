package com.arrays;

public class Target {
	public int findIndex(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	Target target = new Target();
	int arr[] = {12,23,43,56,78};
	System.out.println("Targeted index is :"+target.findIndex(arr,43));
}
}
