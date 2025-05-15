package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApis {

	public static void main(String[] args) {
		/*
		 * Java Stream API Interview Questions & Answers (With Code Examples)
		 */

		// 1. Convert a list of strings to uppercase
		List<String>lists=Arrays.asList("ritesh","anuj","sarthak","rajendra","sushama","mayra");
		List<String> upperCaseList = lists.stream()
		    .map(String::toUpperCase)
		    .collect(Collectors.toList());

		// 2. Count the number of elements in a stream
		long count = lists.stream().count();

		// 3. Find max and min in a stream
		List<Integer>list=Arrays.asList(12,23,34,45,54,43,32,21,11);
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		Optional<Integer> min = list.stream().min(Integer::compareTo);

		// 4. Merge two lists and remove duplicates
		List<Integer>list1=Arrays.asList(11,22,33,44,55);
		List<Integer>list2=Arrays.asList(66,77,88,99,111);
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
		    .distinct()
		    .collect(Collectors.toList()); 
		
		// 5. Find second highest number
		Optional<Integer> secondHighest = list.stream()
		    .sorted(Comparator.reverseOrder())
		    .skip(1)
		    .findFirst();

		// 6. Reverse a list using streams
		List<Integer> reversedList = list.stream()
		    .sorted(Comparator.reverseOrder())
		    .collect(Collectors.toList());

		// 7. Convert stream to array
		String[] array = list.stream().toArray(String[]::new);

		// 8. Sum the values of a list
		int sum = list.stream()
		    .mapToInt(Integer::intValue)
		    .sum();

		// 9. Check if a stream contains a specific element
		boolean exists = list.stream().anyMatch(e -> e.equals("target"));

		// 10. Sort by multiple fields (Employee example)
		List<Employee>employees=new ArrayList<Employee>();
		List<Employee> sortedEmployees = employees.stream()
		    .sorted(Comparator.comparing(Employee::getDept)
		    .thenComparing(Employee::getSalary))
		    .collect(Collectors.toList());
		
		Map<String,Long>ms=employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

		// 11. Remove nulls from a list
		List<String> nonNullList = lists.stream()
		    .filter(Objects::nonNull)
		    .collect(Collectors.toList());

		// 12. Group by department (Employee example)
		Map<String, List<Employee>> groupedByDept = employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDept));

		// 13. Find highest paid employee per department
		Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDept,
		        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		// 14. Find duplicate elements in a list
		Set<Integer> items = new HashSet<>();
		Set<Integer> duplicates = list.stream()
		    .filter(e -> !items.add(e))
		    .collect(Collectors.toSet());

		// 15. First non-repeating character in a string
		Optional<Character> firstNonRepeat = "rajendra".chars()
		    .mapToObj(c -> (char)c)
		    .filter(ch -> "rajendra".indexOf(ch) == "rajendra".lastIndexOf(ch))
		    .findFirst();

		// 16. Frequency of elements
		Map<String, Long> freqMap = lists.stream()
		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// 17. Partition students into pass/fail
		Map<Boolean, List<Employee>> partitioned = employees.stream()
		    .collect(Collectors.partitioningBy(s -> s.getSalary() >= 40000));

		// 18. Palindromic strings in a list
		List<String> palindromes = lists.stream()
		    .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
		    .collect(Collectors.toList());

		// 19. Remove duplicate characters from a string
		String result = "rajendra".chars()
		    .distinct()
		    .mapToObj(c -> String.valueOf((char)c))
		    .collect(Collectors.joining());

		// 20. Anagrams grouping example
		Map<String, List<String>> anagrams = lists.stream()
		    .collect(Collectors.groupingBy(s -> s.chars().sorted()
		        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		        .toString()));

		// 21. Find longest string in a list
		Optional<String> longest = lists.stream()
		    .max(Comparator.comparing(String::length));

		// 22. Reverse each word in a list of strings
		List<String> reversedWords = list.stream()
		    .map(s -> new StringBuilder(s).reverse().toString())
		    .collect(Collectors.toList());

		// 23. Sum of squares of even numbers
		int sumOfSquares = list.stream()
		    .filter(n -> n % 2 == 0)
		    .map(n -> n * n)
		    .reduce(0, Integer::sum);

		// 24. Flatten nested list
		/*
		 * List<Integer> flatList = list.stream() .flatMap(Collection::stream)
		 * .collect(Collectors.toList());
		 */
		// 25. Max word length grouped by starting character
		Map<Character, Optional<Integer>> maxLengthByChar = lists.stream()
		    .collect(Collectors.groupingBy(s -> s.charAt(0),
		        Collectors.mapping(String::length, Collectors.maxBy(Integer::compare))));

		// 26. Join strings with delimiter, prefix, suffix
		String joined = lists.stream()
		    .collect(Collectors.joining(", ", "[", "]"));

		// 27. Generate Fibonacci series using streams
		Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
		    .limit(10)
		    .map(f -> f[0])
		    .forEach(System.out::println);

		/*
		 * End of Java Stream API Code Examples
		 */

	}

}
