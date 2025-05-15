package com.order.pack;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testting {

	public static void main(String[] args) {
		//list of different of values list,integer, boolean, 
		//once list ready then convert that list into map using java 8 stream api
		List<Object> mixedList = Arrays.asList(
	            1, "hello", true, 42, Arrays.asList(1, 2, 3), "world", false, 3.14, Arrays.asList("a", "b")
	        );

		mixedList.stream().collect(Collectors.groupingBy(Object::getClass))
		.forEach((K,V)->System.out.println(K.getSimpleName()+":"+V));;

		System.out.println();
		
		Stream.of(new AbstractMap.SimpleEntry<>(String.class,mixedList.stream().filter(d->d instanceof String).collect(Collectors.toList())),
				new AbstractMap.SimpleEntry<>(Integer.class,mixedList.stream().filter(d->d instanceof Integer).collect(Collectors.toList())),
				new AbstractMap.SimpleEntry<>(ArrayList.class,mixedList.stream().filter(d->d instanceof ArrayList).collect(Collectors.toList())),
				new AbstractMap.SimpleEntry<>(Boolean.class,mixedList.stream().filter(d->d instanceof Boolean).collect(Collectors.toList())),
				new AbstractMap.SimpleEntry<>(Double.class,mixedList.stream().filter(d->d instanceof Double).collect(Collectors.toList())))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).forEach((k,v)->System.out.println(k.getSimpleName()+":"+v));;
		
		//System.out.println(integers);
		
		System.out.println();
		
		/*Map<Class<?>, List<Object>> map = Stream.of(
                new AbstractMap.SimpleEntry<>(String.class, mixedList.stream().filter(e -> e instanceof String).collect(Collectors.toList())),
                new AbstractMap.SimpleEntry<>(Integer.class, mixedList.stream().filter(e -> e instanceof Integer).collect(Collectors.toList())),
                new AbstractMap.SimpleEntry<>(Boolean.class, mixedList.stream().filter(e -> e instanceof Boolean).collect(Collectors.toList())),
                new AbstractMap.SimpleEntry<>(List.class, mixedList.stream().filter(e -> e instanceof List).collect(Collectors.toList())),
                new AbstractMap.SimpleEntry<>(Double.class, mixedList.stream().filter(e -> e instanceof Double).collect(Collectors.toList()))
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Print the result
        map.forEach((k, v) -> System.out.println(k.getSimpleName() + ": " + v));*/
		
		List strList=mixedList.stream().filter(d->d instanceof String).map(String::valueOf).collect(Collectors.toList());
		List intList=mixedList.stream().filter(d->d instanceof Integer).collect(Collectors.toList());
		List doubleList=mixedList.stream().filter(d->d instanceof Double).collect(Collectors.toList());
		List arraylistList=mixedList.stream().filter(d->d instanceof ArrayList).collect(Collectors.toList());
		List booleanList=mixedList.stream().filter(d->d instanceof Boolean).collect(Collectors.toList());
		System.out.println(strList);
		System.out.println(intList);
		System.out.println(doubleList);
		System.out.println(arraylistList);
		System.out.println(booleanList);
		
		Map<String, List<Object>> groupedByType = mixedList.stream()
			    .collect(Collectors.groupingBy(o -> {
			        if (o instanceof Integer) return "Integer";
			        if (o instanceof String) return "String";
			        if (o instanceof Boolean) return "Boolean";
			        if (o instanceof List) return "List";
			        if (o instanceof Double) return "Double";
			        return "Other";
			    }));
		
		System.out.println(groupedByType);
		
		/*list.stream().filter(ob->{
			if(ob instanceof List lists) {
				return ob;
			}else if(ob instanceof Integer inte) {
				return inte;
			}else if(ob instanceof Boolean b) {
				return b;
			}
		}).collect(Collectors.toMap(HashMap::new, ()));*/
		
		//employee table have empname, empid,empcity
		//fetch data who have same city, same name
		
//		select e1.name,e2.city from employee e1 self join employee e2
//		on e1.id=e2.id
//		where e1.name=e2.name and e1.city=e2.city
		
		
		
	}

}
