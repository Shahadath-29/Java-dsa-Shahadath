package com.codegnan.dsa.collections;

import java.util.HashMap;
import java.util.Map;

public class FrequenceOfCharacter {
	public static void main(String[] args) {
		String str = "success";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map= new HashMap();
		
		for(char st:ch) {
			map.put(st, map.getOrDefault(st, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println("Char: "+entry.getKey()+" appers: "+entry.getValue());
		
		}
	}

}
