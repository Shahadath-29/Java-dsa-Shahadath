package com.codegnan.dsa18032026.LinkedList;

public class Traversing {
	public ListNode traverseElement(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(72);
		ListNode l2 = new ListNode(78);
		ListNode l3 = new ListNode(17);
		ListNode l4 = new ListNode(92);
		
		//linking
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		ListNode head = l1;
		Traversing traversing = new Traversing();
		traversing.traverseElement(head);
	}

}
