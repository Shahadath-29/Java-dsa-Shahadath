package com.codegnan.dsa05032026.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSort {
	public static void main(String[] args) {
		List<String> words = new ArrayList(Arrays.asList("pie","apple","banana","Kiwi","guava"));
		words.sort((s1,s2)->{
			int diff=s1.length()-s2.length();
			if(diff!=0) {
				return diff;
			}else {
				return s1.compareTo(s2);
			}
		});
		System.out.println(words);
	}

}
