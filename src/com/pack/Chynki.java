package com.pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chynki {

	public static void main(String[] args) {
		List<String>slist1=Arrays.asList("rajan","jatin","kasis","kapil","rohit","sachin");
		String str=slist1.stream().collect(Collectors.joining(",","[", "]"));
		System.out.println(str);
		
	}

}
