package com.order.pack;


class MyQueue{
	Node front,rear;
	
	public void enqueue(int data) {
		Node newNode=new Node(data);
		if(rear!=null) {
			rear.next=newNode;
		}
		rear=newNode;
		if(front==null) {
			front=newNode;
		}
	}
	
	public int dequeue() {
		if(front==null) throw new RuntimeException("Queue is empty");
		
		int val=front.data;
		front=front.next;
		
		if(front==null)rear=null;
		return val;
				
	}
	
	public int peek() {
		if(front==null)
			throw new RuntimeException("Queue is empty");
		return front.data;
	}
}
public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		queue.enqueue(20);
		queue.enqueue(70);
		queue.enqueue(50);
		queue.enqueue(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
	}

}
