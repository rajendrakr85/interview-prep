package com.pack.box;

import java.util.stream.Collectors;

public class Test12 {

	public static void main(String[] args) {
		"rajendra".chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(f->f,Collectors.counting()))
		.forEach((key,value)->System.out.println(key+":"+value));
	}

}
