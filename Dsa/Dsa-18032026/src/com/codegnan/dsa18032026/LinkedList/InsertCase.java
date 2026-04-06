package com.codegnan.dsa18032026.LinkedList;

public class InsertCase {
	//At Begining
	public ListNode insertBegining(ListNode head,int valToInsert) {
		ListNode newNode = new ListNode(valToInsert);
		
		newNode.next=head; // assiging newnode nextvalue to head
		head = newNode; //head position changed to new node
		return head; //original return head
	}
	
	//At Mid Position
	
	public ListNode insertMid(ListNode head,int valToInsert,int Position) {
		
		//create a new node
		
		ListNode newNode = new ListNode(valToInsert);
		ListNode ptr = head;
		for(int i=1;i<Position-1;i++) {
			ptr = ptr.next;
		}
		newNode.next = ptr.next;
		ptr.next = newNode;
		return head;
	}
	
	//At end
	
	public ListNode insertEnd(ListNode head,int valToInsert) {
		//create new Node
		
		ListNode newNode = new ListNode(valToInsert);
		ListNode ptr = head;
		while(ptr.next!=null) {
			ptr = ptr.next;
		}
		ptr.next = newNode;
		return head;
	}
	// traversing
	public void traverse(ListNode head) {
		ListNode temp = head;
		while(temp!=null) {
			System.out.println(temp.val + " ");
			temp = temp.next;
		}
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
		
		ListNode head = l1;
		InsertCase ic = new InsertCase();
			System.out.println("Before Inserting");
			ic.traverse(head);
			
			head = ic.insertBegining(head, 2);
			System.out.println();
			System.out.println("After Inserting at Begining");
			ic.traverse(head);
			
			ic.insertMid(head, 5, 3);
			System.out.println();
			System.out.println("After insert at middle position");
			ic.traverse(head);
			
			ic.insertEnd(head, 9);
			System.out.println();
			System.out.println("After insert at end position");
			ic.traverse(head);	
		
	}

}
