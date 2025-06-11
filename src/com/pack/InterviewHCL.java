package com.pack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewHCL {

	public static void main(String[] args) {
				List<Integer>noList=Arrays.asList(2, 17, 5, 20, 17, 30, 4, 23, 59, 23);
				Set<Integer>set=new HashSet<Integer>();
				List<Integer>duplicate=noList.stream().filter(no->!set.add(no)).collect(Collectors.toList());
				System.out.println(duplicate);
				
			List<String>s=Arrays.asList(10,15,8,49,25,98,32).stream().map(no->String.valueOf(no))
					.filter(no->no.startsWith("1"))
					.collect(Collectors.toList());
			System.out.println(s);
	}

}
