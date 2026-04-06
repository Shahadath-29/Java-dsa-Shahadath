package com.codegnan.practise;

import java.util.Arrays;

public class LongestSubSequence {
	public int longest(int nums[]) {
		if(nums.length==0) {
			return 0;
		}
		Arrays.sort(nums);
		
		int current = 1;
		int longest = 1;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]+1) {
				current++;
			}
			longest = Math.max(longest, current);
		}
		return longest;
	}
	public static void main(String[] args) {
		LongestSubSequence longestSubSequence = new LongestSubSequence();
		int nums[] = {100,4,101,1,3,2};
		int result = longestSubSequence.longest(nums);
		System.out.println("longest sub sequence: " + result);
	}

}
