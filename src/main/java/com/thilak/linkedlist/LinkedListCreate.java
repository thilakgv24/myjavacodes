package com.thilak.linkedlist;



public class LinkedListCreate {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<Integer>(10);
		//System.out.println(n1);
		Node<Integer> n2 = new Node<Integer>(20);
		Node<Integer> n3 = new Node<Integer>(20);
		Node<Integer> n4 = new Node<Integer>(40);
		Node<Integer> n5 = new Node<Integer>(50);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		/*Node.print(n2);
		System.out.println(n1.next);
		System.out.println(n2);
		Node.length(n1);*/
		Node<Integer> temp = n1;
		System.out.println(temp);
		//System.out.println(temp.next +"******"+ temp.data+"***"+ temp);
		int size =0;
		while(temp != null) {
			//System.out.println(temp);
			size++;
			//System.out.println(temp.next +"******"+ temp.data+"***"+size);
			System.out.println(temp.next +"******"+ temp.data+"***"+ temp);
			temp = temp.next;
		}
		
		return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> node = createLinkedList();
		//Node.print(node);
		
		/*Node<Integer> node1 = new Node<Integer>(10);
	    Node<Integer> node2 = new Node<Integer>(20);
	    node1.next = node2;*/
	    //Node.increment(node1);
	    //Node.print(node1);

	}

}
