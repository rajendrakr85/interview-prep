  package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
   public static void main(String args[])
   {
	   List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
	   //System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
	   System.out.println(ls.stream().max(Integer::max).get()); //3
	   //System.out.println(ls.stream().max(Integer::compare).get()); //3
	   //System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4
	   
	   //System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b));
	   
	   TreeMap<Integer, Integer>tm=new TreeMap<Integer, Integer>();
	   tm.put(3,30);
	   tm.put(9,90);
	   tm.put(5,50);
	   tm.put(8,80);
	   tm.put(13,130);
		/*
		 * System.out.println(tm);
		 * System.out.println(tm.descendingMap());
		 * System.out.println(tm.firstEntry()); System.out.println(tm.lastEntry());
		 * System.out.println(tm.higherKey(5)); System.out.println(tm.lowerKey(9));
		 * System.out.println(tm.firstKey());
		 * tm.forEach((key,value)->System.out.println(key+"="+value));
		 * tm.entrySet().stream().forEach((e)->System.out.println(e.getKey()+":"+e.
		 * getValue()));
		 */
	   
	   List<Map.Entry<Integer, Integer>>mapvaluesort=new ArrayList<Map.Entry<Integer,Integer>>(tm.entrySet());
	   System.out.println(mapvaluesort);
	   
	   mapvaluesort.sort(Map.Entry.comparingByKey());
	   
	   System.out.println(mapvaluesort);
   }
}