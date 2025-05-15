package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tecchy {

	public static void main(String[] args) {
			List<String>liststr=Arrays.asList("danny dengogpa","johney dep","sunny dharam deol","ronney roi","kavvy maran");
			
			var map=liststr.stream().collect(Collectors.toMap(String::length,Function.identity(), (existingkey, replacingkey)->existingkey));
			System.out.println(map);
			
			var nmap=liststr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(nmap);

			String str=liststr.stream().collect(Collectors.joining(",","dr. "," from india"));
			System.out.println(str);
			
			
			List<String>joinstr=liststr.stream().flatMap(s->Stream.of(s.split(""))).collect(Collectors.toList());
			System.out.println(joinstr);
			
			List<Integer>nlist=IntStream.range(1, 5).boxed().collect(Collectors.toList());
			System.out.println(nlist);
			
			
	}

}
