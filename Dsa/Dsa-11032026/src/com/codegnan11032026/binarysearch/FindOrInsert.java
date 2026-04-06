package com.codegnan11032026.binarysearch;

public class FindOrInsert {
	public static int SearchInsert(int nums[],int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]>target) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		int nums [] = {1,3,4,5};
		int target = 6;
		System.out.println("Index: " + SearchInsert(nums, target));
	}

}
