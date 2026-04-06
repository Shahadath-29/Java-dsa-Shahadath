package com.codegnan.dsa06032026.slidingwindow;

public class MaxSubArray {

	public static int maxSumb(int nums[],int k) {
		if(nums.length<k) {
			return 0;
			
		}
		int windowSum=0;
		int maxSum=0;
		for(int i=0;i<k;i++) {
			windowSum=windowSum+nums[i];
		}
		maxSum=windowSum;
		for(int i=k;i<nums.length;i++) {
			windowSum=windowSum-nums[i-k]+nums[i];
			maxSum=Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int nums[]= {2,1,5,1,3,2};
		System.out.println(MaxSubArray.maxSumb(nums, 3));
		
		
	}

}

	     

	
	
	//brute force approach
//	public static int maxSub(int nums[],int k) {
//		int maxSum=Integer.MIN_VALUE;
//		for(int i=0;i<nums.length-k;i++) {
//			int sum=0;
//			for(int j=i;j<i+k;j++) {
//				sum=sum+nums[j];
//			}
//			maxSum=Math.max(maxSum, sum);
//		}
//		return maxSum;
//	}
//	public static void main(String[] args) {
//		int nums[]= {2,1,5,1,3,2};
//		System.out.println(MaxSubarray.maxSub(nums, 3));
//		
//		
//	}
//
//}


