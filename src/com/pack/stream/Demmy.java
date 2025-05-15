package com.pack.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demmy {

	public static void main(String[] args) {
		String str="rajendra";
		System.out.println(str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst());
		System.out.println();
		
		List<String> words = List.of("apple", "bat", "ball", "arm", "dog");
		System.out.println(words.stream().collect(Collectors.groupingBy(sr->sr.length(),Collectors.joining(","))));
		
		List<List<Integer>> listOfLists = List.of(
			    List.of(1, 2, 3),
			    List.of(3, 4, 5),
			    List.of(5, 6)
			);
		
		listOfLists.stream().flatMap(lst->lst.stream())
			.distinct().collect(Collectors.toList()).forEach(System.out::println);;
			
			
			
	}

}
