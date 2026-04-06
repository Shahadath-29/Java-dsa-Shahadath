package com.codegnan.collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Bahu");
		al.add("hii");
		al.add("Hello");
		al.add("Raja");
		System.out.println(al);
		
		System.out.println("Iterating Forward");
		
		ListIterator<String> itr = al.listIterator();
		while(itr.hasNext()) {
			if(itr.next().contains("Bahu")) {
				itr.set("Japanya");
			}
		}
		for(String str : al) {
			System.out.println(str);
		}
		
		System.out.println("Reverse Direction");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
				
			}
		}
		
		
		
	}


