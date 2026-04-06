package com.codegnan.dsa04032026.string;

public class AnagramCheck {
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		int arr[] = new int[26];
		for(int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)-'a']++;
			arr[str2.charAt(i)-'a']--;
			
		}
		for(int count:arr) {
			if(count!=0) {
				return false;
			}
		}
		
		
	return true;	
	}
	public static void main(String[] args) {
		System.out.println(AnagramCheck.isAnagram("silent","listen"));
	}

}
