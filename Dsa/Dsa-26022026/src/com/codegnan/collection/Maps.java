package com.codegnan.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashMap = new HashMap();
		
		hashMap.put(101, 12);
		hashMap.put(102, 13);
		hashMap.put(103, 18);
		
		/*hashMap.put("Sameer", 899);
		hashMap.put("Shahadath", 999);
		hashMap.put("Sameer", 88);
		
		System.out.println(hashMap);*/
		
		System.out.println(hashMap.get(101));
		System.out.println(hashMap.get(191));
		System.out.println(hashMap.getOrDefault(101,0));
		System.out.println(hashMap.containsKey(101));
		
		//by using iterator(Keyset(),entryset())
		
		Set<Entry<Integer,Integer>> result = hashMap.entrySet();
		
		Iterator<Entry<Integer,Integer>> itr = result.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Integer>finalResult=itr.next();
			System.out.println(finalResult.getKey()+" "+finalResult.getValue());
			}
		
		
	}

}
