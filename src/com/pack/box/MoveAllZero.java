package com.pack.box;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllZero {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,0,-3,5,-6,0,3,6,-7,4);
		
		List<Integer>moveZero=Stream.concat(numbers.stream().filter(n->n!=0), numbers.stream().filter(n->n==0))
			.collect(Collectors.toList());
		
		System.out.println(moveZero);
		
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("A", 20);
		map.put("B", 57);
		map.put("C", 22);
		map.put("D", 95);
		map.put("E", 55);
		map.put("F", 38);
		map.put("G", 34);
		map.put("H", 56);
		
		
		Map<String,Integer>sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->a, LinkedHashMap::new));
		sortedMap.forEach((a,b)->System.out.println(a+":"+b));
		
		Function<Integer, Integer>fun=(no)->(7+11)-no;
		System.out.println(fun.apply(11));
		
		
		List<Integer> noList=Arrays.asList(8,2,3,4,4,5,5,6,6,7,8,9,1,3,1,2);
		
		List<Integer>fList=  noList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
							.entrySet().stream().filter(m->m.getValue()>1)
							.map(n->n.getKey()).collect(Collectors.toList());
		System.out.println(fList);
		
		
		
		
	}

}
