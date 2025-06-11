package com.pack.box;

import java.util.stream.IntStream;

public class PrimeNoStream {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100).filter(n->n>1 && IntStream.rangeClosed(2, (int)Math.sqrt(n))
				.noneMatch(i->n%i==0)).forEach(System.out::println);
	}

}
