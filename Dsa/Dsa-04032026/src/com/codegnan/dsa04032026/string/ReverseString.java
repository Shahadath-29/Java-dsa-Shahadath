package com.codegnan.dsa04032026.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		char ch[] = str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			char temp=ch[right];
			ch[right]=ch[left];
			ch[left]=temp;
			left++;
			right--;
		}
		
		for(char rev:ch) {
			System.out.print(rev);
		}
		
	}

}
