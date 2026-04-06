package com.codegnan.dsa06032026.slidingwindow;

public class SmallestSubarray {
	public static int minLength(int target,int nums[]) {
		int minLen=Integer.MAX_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=i;j<nums.length;j++) {
				sum=sum+nums[j];
				if(sum>=target) {
					minLen=Math.min(minLen, j-i+1);
					break;
				}
			}
		}
		return minLen==Integer.MAX_VALUE?0:minLen;
	}
	public static void main(String[] args) {
		int nums[] = {2,3,1,2,4,3};
		System.out.println(SmallestSubarray.minLength(7, nums));
	}
}

//	public static void main(String[] args) {
//		int arr[]= {2,3,1,2,4,3};
//		int target=7;
//		int minlen=Integer.MAX_VALUE;
//		int min=0;
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			for(int j=i;j<arr.length;j++) {
//				sum=sum+arr[j];
//				if(sum>=target) {
//					min=j-i+1;
//					minlen=Math.min(min, minlen);
//				}
//			}
//			
//			
//		}System.out.println(minlen);
//	}




