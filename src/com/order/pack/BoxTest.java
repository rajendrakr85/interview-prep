package com.order.pack;

import java.lang.classfile.TypeAnnotation.OffsetTarget;

class Box<T>{
	private T value;
	
	public void set(T value) {
		this.value=value;
	}
	public T get() {
		return value;
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box<String>test=new Box();
		test.set("Rajendra");
		System.out.println(test.get());
		
		Box<Integer>test2=new Box();
		test2.set(20);
		System.out.println(test2.get());
		
	}

}
