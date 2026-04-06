package com.codegnan.dsa05032026.strings;

import java.util.Arrays;

public class SortZeroOneTwos {
	public static void sortColors(int nums[]) {
		int start = 0;
		int mid = 0;
		int end = nums.length-1;
		
		while(mid<=end) {
			if(nums[mid]==0) {
				swap(nums, start, mid);
				start++;
				mid++;
			}else if(nums[mid]==1) {
				mid++;
			}else {
				swap(nums, mid, end);
				end--;
			}
		}
	}
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int nums[]= {2,0,2,1,2,1,0,1,0};
		SortZeroOneTwos.sortColors(nums);
		System.out.println(Arrays.toString(nums));
		
	}

}
