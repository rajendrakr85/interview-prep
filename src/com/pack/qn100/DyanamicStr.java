package com.pack.qn100;

import java.util.LinkedList;
import java.util.List;

class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show()");
    }
    
    void show(String abc) {
    	System.out.println(abc);
    }
}


public class DyanamicStr {

	public static void main(String[] args) {
		String dynmStr="""
					{
						"name":"%s",
						"age":%d
					}
					""".formatted("rajendra", 40);
		
		//System.out.println(dynmStr);
		Child p=new Child();
		p.show();
		
		List<Integer>list=new LinkedList<Integer>();
	}

}
