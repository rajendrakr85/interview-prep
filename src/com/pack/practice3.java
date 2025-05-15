package com.pack;
class Person{
	Person(String s, int i){
		++pid;
		name=s;
		age=i;
	}
	static int pid;
	int age;
	String name;
}
public class practice3 {
	public static void main(String[] args) {
		Person p1=new Person("John", 22);
		practice3 pe=new practice3();
		Person p2=pe.change(p1);
		System.out.println(p2.pid+" "+p2.name+" "+p2.age);
		System.out.println(p1.pid+" "+p1.name+" "+p1.age);
	}
	private Person change(Object o) {
		Person p2=(Person)o;
		p2.age=25;
		return p2;
	}
}

