package com.codegnan.dsa05032026.strings;

import java.util.Arrays;

public class LargestConcatNum {
	public static String longest(int nums[]) {
	   String str[] = new String[nums.length];
	   for(int i=0;i<nums.length;i++) {
		str[i] = String.valueOf(nums[i]);
	   }
	   Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
	
	   if(str[0].equals("0")) {
		  return "0";
	   }
	   StringBuilder sb = new StringBuilder();
	   for(String s:str) {
		  sb.append(s);
	   }
	    return sb.toString();
	}
	
	
	public static void main(String[] args) {
		int num[] = {3,30,34,5,9};
		System.out.println(LargestConcatNum.longest(num));
		
	}

}
