package com.order.pack;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoTest {

	public static void main(String[] args) {
				System.out.println(new StringBuilder("rajendra").reverse().toString());
				System.out.println("rajendra".chars().mapToObj(c->(char)c)
						.collect(Collectors.collectingAndThen(Collectors.toList(), l->{
							Collections.reverse(l);
							return l.stream();
						})).map(String::valueOf).collect(Collectors.joining()));
				
				System.out.println(IntStream.range(0, "rajendra".length())
					.mapToObj(i->"rajendra".charAt("rajendra".length()-i-1))
					.map(String::valueOf)
					.collect(Collectors.joining()));
				
				
				
	}

}
