package com.codegnan.dsa16032026.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {
	public static void main(String[] args) {
		Queue<Integer> que =new LinkedList<>();
		que.add(34);
		que.add(89);
		que.offer(64);
		que.offer(63);
		que.offer(53);
		que.offer(83);
		
		System.out.println("All Elements : "  + que);
		System.out.println("Remove elements: "+ que.poll());
		System.out.println("Remove elements: "+que.remove());
		System.out.println("fetch element: "+que.peek());
		System.out.println("Fetch element: " + que.element());
		System.out.println("Print elemnts: " + que);
		System.out.println("is empty : "+que.isEmpty());
		System.out.println("Size is: " + que.size());
	}

}
