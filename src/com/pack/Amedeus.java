package com.pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Amedeus {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Guneet Singh", 
				"Ashbel Joshua", "Rajendra kumar", "Madhusudan");
		
		names.stream().map(s->{
			String finals="";
			if(s.split(" ").length==2){
				finals=s.split(" ")[0].charAt(0)+"."+
				s.split(" ")[1].charAt(0)+".";
				return finals;
			 }else {
				 finals=s.split(" ")[0].charAt(0)+".";
				 return finals;
			 }
			}
			).forEach(System.out::println);
		
		
		
		names.stream().map(name->Arrays.stream(name.trim().split("\\s"))
					.map(word->word.substring(0, 1).toUpperCase())
					.collect(Collectors.joining("."))
				).forEach(s->System.out.println(s+"."));
		
		
					
	}

}
