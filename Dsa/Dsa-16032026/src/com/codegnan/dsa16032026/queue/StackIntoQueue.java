package com.codegnan.dsa16032026.queue;

import java.util.Stack;

public class StackIntoQueue {
	Stack<Integer> input = new Stack();
	Stack<Integer> output = new Stack();
	
	//Pushing
	public void push(int val) {
		input.push(val);
	}
	//poping
	public int pop() {
		peek();
		return output.pop();
	}
	//peeking
	
	public int peek() {
		if(output.isEmpty()) {
			while(!input.isEmpty()) {
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	public boolean empty() {
		return input.isEmpty() && output.isEmpty();
		
	}
	public static void main(String [] args) {
		StackIntoQueue stack = new StackIntoQueue();
		stack.push(23);
		stack.push(82);
		stack.push(28);
		stack.push(93);
		System.out.println("peek the element: " +stack.peek());
		System.out.println("pop element: " + stack.pop());
		System.out.println("peek: element " + stack.peek());
		
	}

}
