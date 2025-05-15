package com.order.pack;


class MyStack{
	Node top;
	
	public void push(int data) {
		Node current=new Node(data);
		current.next=top;
		top=current;
	}
	
	public int pop() {
		if(top==null)
			throw new RuntimeException("Stack is empty");
		int data=top.data;
		top=top.next;
		return data;
	}
}
public class StackTest {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(10);
		stack.push(40);
		stack.push(20);
		stack.push(60);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
