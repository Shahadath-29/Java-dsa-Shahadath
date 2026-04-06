package com.demo;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "level";
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			str2 += ch;
		}
		if(str2.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
