package com.codegnan.dsa.collections;

import java.util.HashMap;
import java.util.Map;

public class UsingHashmap {
   public static void main(String[] args) {
	int arr[] = {1,2,1,2,3,3,2};
	
	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	
	for(int num:arr) {
		map.put(num, map.getOrDefault(num, 0)+1);
	}
	
	for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
		System.out.println("Number: "+entry.getKey()+" appers: "+entry.getValue());
	}
   }

}
