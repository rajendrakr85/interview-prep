package com.pack.flocareer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhotanInterview {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		
		System.out.println(sum.get());
	}

}
