package com.pack;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceString {

	public static void main(String[] args) {
		//Count occurrence of all characters in given string

		/*output :

		i 2

		n 1

		t 1

		e 2

		r 1

		v 1

		w 1*/
		String s="interview";
		s.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((k,v)->System.out.println(k+":"+v));
		
		
		//Remove all adjacent same characters from given string
		String s1="azxxzy";
		//String s1="acaaabbbacddd";
		//output : 
		//s1 = "ay";
		//s2="acac";
		StringBuilder sb=new StringBuilder();
		for(char c:s1.toCharArray()) {
			int len=sb.length();
			if(len>0 && sb.charAt(len-1)==c) {
				sb.deleteCharAt(len-1);
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
		
		String ss=null;
		Optional<String>strs=Optional.ofNullable(ss);
		System.out.println(strs);
	}

}
