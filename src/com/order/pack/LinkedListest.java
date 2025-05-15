package com.order.pack;



class MyLinkedList{
	Node head;
	public void insertNode(int data) {
		Node temp=new Node(data);
		if(head==null) {
			head=temp ;
		}else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=temp;
		}
	}
	public void traverse() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void deteleNode(int data) {
		if(head==null) {
			return;
		}
		if(head.data==data) {
			head=head.next;
			return;
		}
		
		Node current=head;
		while(current.next!=null && current.next.data!=data) {
			current=current.next;
		}
		if(current.next!=null) {
			current.next=current.next.next;
		}
		
	}
}

public class LinkedListest {

	public static void main(String[] args) {
		MyLinkedList linkedList=new MyLinkedList();
		linkedList.insertNode(36);
		linkedList.insertNode(33);
		linkedList.insertNode(56);
		linkedList.insertNode(34);
		linkedList.insertNode(44);
		linkedList.insertNode(36);
		linkedList.insertNode(22);
		linkedList.insertNode(23);
		
		linkedList.traverse();
		
		linkedList.deteleNode(44);
		System.out.println();
		linkedList.traverse();
	}

}
