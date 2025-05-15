package com.order.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7};
		int k=3;
		List<Integer>intList=IntStream.of(arr).boxed()
				.collect(Collectors.toCollection(ArrayList::new));
		
		
		Integer[] iarr={1,2,3,4,5,6,7};
		List<Integer> list=new ArrayList<>(Arrays.asList(iarr));	
		//list.forEach(s->System.out.println(s));
		
		//list.stream().forEach(System.out::print);
		//System.out.println("");
		//list.parallelStream().forEachOrdered(System.out::print);
		
		//System.out.println(list.parallelStream().parallel().isParallel());
		
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
//		List<Integer>listInteger=new ArrayList<Integer>();
//		Integer sum=Stream.iterate(0, s->s+1).limit(20).reduce(0,(a,b)->(a+b));
//		Stream.iterate(1, s->s+1).limit(20).forEach(s->listInteger.add(s));
//		System.out.println(sum);
//		System.out.println(listInteger);
//		System.out.println(listInteger.size());
		
		List<Employee>tet=getEmployee().stream().parallel()
				.takeWhile(e->e.getSalary()>65000)
				//.collect(ArrayList::new,ArrayList::add,(left,right)->left.addAll(right));
				.collect(Collectors.toList());
		System.out.println(tet);
		
		
	}

	public static List<Employee>getEmployee(){
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(1, "Alice", "HR", 50000));
	        employees.add(new Employee(2, "Bob", "IT", 70000));
	        employees.add(new Employee(3, "Charlie", "IT", 60000));
	        employees.add(new Employee(4, "David", "Finance", 65000));
	        employees.add(new Employee(5, "Eva", "HR", 55000));
	        employees.add(new Employee(6, "Frank", "IT", 70000));
	        employees.add(new Employee(7, "Grace", "Finance", 80000));
	        employees.add(new Employee(8, "Hannah", "IT", 90000));
	        employees.add(new Employee(9, "Ian", "Finance", 62000));
	        employees.add(new Employee(10, "Jack", "HR", 48000));
	        
	        return employees;
	}
	
}
