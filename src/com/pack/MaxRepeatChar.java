package com.pack;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatChar {

	public static void main(String[] args) {
		String str="developer";
		//maximum repeating character in string
		//e=3
		
		
		Entry<Character, Long> entry=str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.collect(Collectors.maxBy(Map.Entry.comparingByValue())).get();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

}
