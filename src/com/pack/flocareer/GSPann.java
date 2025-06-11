package com.pack.flocareer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GSPann {

	public static void main(String[] args) {
		//Given a list of lists of integers, flatten the lists into a single list and remove duplicates.
		List<List<Integer>> listOfLists = Arrays.asList(
		           Arrays.asList(1, 2, 3),
		           Arrays.asList(3, 4, 5),
		           Arrays.asList(5, 6, 7)
		       );
		
		List<Integer>listData= listOfLists.stream().flatMap(list->list.stream()).distinct().collect(Collectors.toList());
		//System.out.println(listData);
		
//		Write a program that returns all subsets of a given string (no duplicate characters).
//		Input: "abc"
//		Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]
		
	}

}
