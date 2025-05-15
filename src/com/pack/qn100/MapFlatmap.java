package com.pack.qn100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFlatmap {

	public static void main(String[] args) {
		List<List<String>>lol=Arrays.asList(Arrays.asList("Jatin","kapil"),Arrays.asList("Naveen","khaleel"));
		lol.forEach(System.out::print);
		System.out.println();
		Stream<List<String>>sstr=lol.stream().map(list->new ArrayList<>(list));
		sstr.forEach(System.out::print);
		System.out.println();
		lol.stream().flatMap(lst->lst.stream()).forEach(System.out::println);

	}

}
