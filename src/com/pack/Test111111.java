package com.pack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test111111 {

	public static void main(String[] args) {
		Integer sum=Stream.of(1,2,3,4,5,6,7,8)
				.filter(n->n%2==1)
				.map(n->n*n)
				.collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(sum);
	}

}
