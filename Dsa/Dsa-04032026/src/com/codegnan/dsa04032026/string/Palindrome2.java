package com.codegnan.dsa04032026.string;

public class Palindrome2 {
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(!Character.isLetterOrDigit(str.charAt(left))) {
				left++;
			}else if(!Character.isLetterOrDigit(str.charAt(right))) {
				right--;
			}else {
				if(Character.toLowerCase(str.charAt(left))!= Character.toLowerCase(str.charAt(right))){
					return false;
				}
				right--;
				left++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str ="A man,a plan, a canal:Panama";
		System.out.println(Palindrome2.isPalindrome(str));
	   
	}

}
