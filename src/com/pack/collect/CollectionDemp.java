package com.pack.collect;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionDemp {

	public static void main(String[] args) {
		var names=new HashSet<String>();
		names.add("rajendra");
		names.add("kapil");
		names.add("sarthak");
		names.add("sushama");
		names.add("ashok");
		names.forEach(System.out::println);
		
		System.out.println();
		
		var lset=new LinkedHashSet<String>();
		lset.add(null);
		lset.add("doney");
		lset.add("johney");
		lset.add("boney");
		lset.add("rohney");
		lset.add("irony");
		lset.forEach(System.out::println);
	}

}
