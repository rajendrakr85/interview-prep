package com.pack;

public class practice4 {
	static int a;
	int b;
	public void incr() {
		int c=a++;
		System.out.println(a+" "+c);
		b++;
		c++;
		System.out.println(a+" "+c);
		System.out.println(a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		practice4 p4= new practice4();
		p4.incr();
		a++;
		p4=new practice4();
		p4.incr();
	}

}
