package com.codegnan.dsa18032026.LinkedList;

public class DeleteCase {
	
	//delete at begining
	public ListNode deleteBeg(ListNode head) {
		head = head.next;
		return head;
	}
	
	//delete at position
	
	public ListNode deletePosition(ListNode head,int pos) {
		ListNode ptr = head;
		
		for(int i=1;i<pos-1;i++) {
			ptr=ptr.next;
		}
		ListNode deleteElement = ptr.next;
		ListNode nextElement = deleteElement.next;
		ptr.next = nextElement;
		
		//ptr.next = ptr.next.next;
		return head;
	}
	//delete at end 
	
	public ListNode deleteEnd(ListNode head) {
		ListNode ptr = head;
		while(ptr.next.next!=null) {
			ptr=ptr.next;
		}
		ptr.next=null;
		return head;
	}
	
	public void traverse(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		//creating nodes
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(8);
		ListNode l4 = new ListNode(10);
		ListNode l5 = new ListNode(12);
				
		//linking
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		
		ListNode head = l1;
		
		DeleteCase dc = new DeleteCase();
		dc.traverse(head);
		
		head=dc.deleteBeg(head);
		System.out.println();
		dc.traverse(head);
		
		head=dc.deletePosition(head,3);
		System.out.println();
		dc.traverse(head);
		
		head=dc.deleteEnd(head);
		System.out.println();
		dc.traverse(head);
	}

}
