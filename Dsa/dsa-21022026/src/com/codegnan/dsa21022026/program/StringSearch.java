package com.codegnan.dsa21022026.program;

public class StringSearch {
	 public String stringSearch(String arr[],String target) {
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i].equals(target)) {
				 System.out.println("Name is found at Index:" + i);
			 }
		 }
		 return null;
		
	}
	 public static void main(String[] args) {
		StringSearch search = new StringSearch();
		String arr[] = {"bahu", "bali", "deva","sena"};
		String target = "sena";
		search.stringSearch(arr, target);
	}

}
