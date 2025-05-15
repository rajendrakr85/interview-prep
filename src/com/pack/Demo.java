package com.pack;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

	public static void main(String[] args) {

		var str="this is test for var";
		var num=10;
		//System.out.println(str instanceof String);
		System.out.println(new StringBuilder(str).reverse().toString());
		
		
		String ss=str.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.collectingAndThen(Collectors.toList(), list->{
				Collections.reverse(list);
				return list.stream();})).map(String::valueOf)
			.collect(Collectors.joining());
		
		System.out.println(ss);
		
		System.out.println(IntStream.range(0, str.length())
				.mapToObj(i->str.charAt(str.length()-i-1))
				.map(String::valueOf)
				.collect(Collectors.joining()));
		
		Integer i1=100;
		Integer i2=100;
		System.out.println(i1.equals(i2));
		
	}

}
