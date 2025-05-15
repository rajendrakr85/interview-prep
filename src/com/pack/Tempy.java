package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tempy {

	public static void main(String[] args) {
		String sno="javaworldtolearn";
		Map<Character,Long>champs=sno.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(champs);
		
		String ss="thisisfornonrepeatingchars";
		
		Optional<Character> cc= ss.chars().mapToObj(c->(char)c).filter(c->ss.indexOf(c)==ss.lastIndexOf(c)).findFirst();
		System.out.println(cc.get());
		
		List<String> sstr=Arrays.asList("javaj","kava11","javaj2223","madam12121","ladamsfsssggsgsd","madam");
		
		List<String>pastr=sstr.stream().filter(str->str.equals(new StringBuilder(str).reverse().toString()))
				.distinct()
				.collect(Collectors.toList());
		System.out.println(pastr);
		
		Optional<String>longstr= sstr.stream().max(Comparator.comparing(String::length));
		System.out.println(longstr);
		
		
	    var age=new HashMap<String, Integer>();
	    age.put("rajan", 20);
	    age.put("kalash", 39);
	    age.put("tarun", 22);
	    age.put("sarthak", 50);
	    age.put("jatin", 36);
	    age.put("naveen", 33);
	    age.put("arun", 23);
	    
	    var tmap=new TreeMap<String, Integer>(age);
	    //System.out.println(tmap);
	    
	    age.entrySet().stream().sorted(Map.Entry.comparingByValue())
	    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue,
                LinkedHashMap::new)).forEach((key,value)->System.out.println(key+"-"+value));
	    
	    List<Map.Entry<String, Integer>>lmap=new ArrayList<Map.Entry<String,Integer>>(age.entrySet());
	    lmap.sort(Map.Entry.comparingByValue());
	    //System.out.println(lmap);
	    //lmap.forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
	    
	    
		
	}

}
