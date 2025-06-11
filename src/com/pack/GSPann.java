package com.pack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GSPann {

	public static void main(String[] args) {
		//list of employee, id, salary, name, department
		//get second highest salary
		
		//sort it by salary in descending order
		//skip top 1
		// choose first
		
		List<Employee>list=new ArrayList<Employee>();
		
		Optional<Employee>secondHighestSalary= list.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.skip(1)
				.findAny();
		
	}

}
