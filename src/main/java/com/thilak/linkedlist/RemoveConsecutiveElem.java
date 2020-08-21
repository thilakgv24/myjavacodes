package com.thilak.linkedlist;

public class RemoveConsecutiveElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head = createLinkedList();

		System.out.println(removeDuplicates(head));

	}

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		// Your code goes here

		LinkedListNode<Integer> temp = head;

		while (temp != null) {
			//System.out.println(temp + "*****" + temp.data + "*****" + temp.next);
			if (temp.next != null && temp.data == temp.next.data) {
				temp.next = temp.next.next;

			} else {
				temp = temp.next;
			}
			System.out.println();
		}
		
		 while(head != null) {
	            System.out.println(head + "  "+head.data + " " + head.next);
	            head = head.next;
	        }

		return head;
	}

	public static LinkedListNode<Integer> createLinkedList() {
		// Your code goes here

		LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(20);
		// System.out.println(n1);
		LinkedListNode<Integer> n2 = new LinkedListNode<Integer>(20);
		LinkedListNode<Integer> n3 = new LinkedListNode<Integer>(20);
		LinkedListNode<Integer> n4 = new LinkedListNode<Integer>(40);
		LinkedListNode<Integer> n5 = new LinkedListNode<Integer>(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		return n1;
	}

}
