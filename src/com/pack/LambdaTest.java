package com.pack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface Multiply{
	int multiply(int a,int b);
}
public class LambdaTest {

	public static void main(String[] args) {
		Multiply multi=(a,b)->a*b;
		System.out.println(multi.multiply(10, 2));
		
		List<Integer>list=Arrays.asList(2,3,4,2,7,8,3,5,4);
		
		if(!Optional.of(list).isEmpty()) {
			System.out.println("list is not empty");
		}
		
		Optional<String>str=null;
		if(Optional.ofNullable(str).isEmpty())
			System.out.println(str);
		
		Map<Integer, Long>freq= list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freq);
		
		freq.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(old,newv)->old,
				LinkedHashMap::new));
		
		
		
	}
	

}
