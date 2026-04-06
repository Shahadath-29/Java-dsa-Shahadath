package com.codegnan.dsa18032026.LinkedList;

public class ListNode {
	int val;
	ListNode next;
	
	public ListNode(int x) {
		this.val = x;
	}
	
	public static void main(String[] args) {
		//creating list of nodes
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(8);
		
		//linking
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		//iterating
		ListNode ptr = l1;
		while(ptr!=null) {
			System.out.print(ptr.val + " ");
			ptr = ptr.next;
		}
		
	}

}
