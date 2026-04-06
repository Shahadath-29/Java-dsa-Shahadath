package com.codegnan.dsa13032026.stack;

import java.util.Stack;

public class StackBasic {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack();
		
		st.push(78);
		st.push(17);
		st.push(75);
		st.push(35);
		st.push(84);
		st.push(45);
		
		System.out.println("Size of the Stack: " + st.size());
		System.out.println("top element: "+st.peek());
		System.out.println("Search element: "+st.search(35));
		System.out.println("Remove element: "+ st.pop());
		System.out.println("find is empty or not: "+ st.isEmpty());
		
		
	}

}
