package com.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BuzzTest {

	public static void main(String[] args) {
		String str="SOFTWAREENGINEER";
		
		str.chars().mapToObj(c->(char)c).map(String::valueOf)
		.filter(c->"AEIOU".indexOf(c)>=0)
		.collect(Collectors.groupingBy(Function.identity(),TreeMap::new, Collectors.counting()))
		.forEach((k,v)->System.out.println(k+" "+v));
		
		Employee e1=new Employee(110,"HR",1100);
		Employee e2=new Employee(112,"CT",1200);
		Employee e3=new Employee(114,"MR",1300);
		Employee e4=new Employee(116,"SL",1400);
		Employee e5=new Employee(221,"FI",1500);
		Employee e6=new Employee(110,"HR",1100);
		
		Map<Employee,Integer>emap=new HashMap<Employee, Integer>();
		emap.put(e1, 2100);
		emap.put(e2, 2200);
		emap.put(e3, 2300);
		emap.put(e3, 2400);
		emap.put(e5, 2500);
		emap.put(e6, 2500);
		
		System.out.println(emap.get(e1));
		System.out.println(emap.get(e6));
		
		Iterator<Entry<Employee, Integer>> itr=emap.entrySet().iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next().getKey().getDept());
	}

}
