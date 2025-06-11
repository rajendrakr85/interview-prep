package com.inter.view;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Coforge {

	public static void main(String[] args) {
		List<List<String>> myList = Arrays.asList( Arrays.asList("12","32","#","31","45"),Arrays.asList("2","10",null,"31","45"));
		
		Predicate<Integer>even=(a)->a%2==0 && a!=0;
		Function<String, Integer>mapFunction=(str)->{
				  try {
					  return Integer.valueOf(str);
				  }catch(Exception e) {
					  return 0;
				  }
		};
		Optional<Integer> evenSum=myList.stream()
					.flatMap(List::stream)
				  .map(mapFunction)
				 //.filter(no->no!=null && (Optional.of(Integer.parseInt(no)).isEmpty() && Integer.parseInt(no)%2==0))
				 //.mapToInt(Integer::valueOf)
				 .map(Integer::valueOf)
				 .filter(ev->ev%2==0)
				  //.sum();
				 .reduce((a,b)->a+b);
		System.out.println(evenSum.get());
		
		
	}

}
