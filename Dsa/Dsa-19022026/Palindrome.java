package com.demo;

public class Palindrome {
	public static void main(String[] args) {
		
		int original = 121;
		int n = original;
		int rev=0;
		while(n!=0) {
			 rev=rev*10+n%10;
			 n=n/10;
		}
		if(original==rev) {
			System.out.println("it is Palindrome");
		}
		else {
			System.out.println("it is not Palindrome");
		}
	}
}

