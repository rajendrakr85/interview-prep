package com.pack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Tested11{
	Integer id;
	String name;
	
	
	
	public Tested11(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
public class InterviewTesting11 {

	public static void main(String[] args) {
//			Tested11 ob1=new Tested11(101, "ABC");
//			Tested11 ob2=new Tested11(102, "XYZ");
//			Tested11 ob3=new Tested11(103, "RST");
//		
//			HashMap<Tested11, Integer> map=new HashMap<Tested11, Integer>();
//			
//			map.put(ob1, 101);
//			map.put(ob2, 102);
//			map.put(ob3, 103);
//			
//			System.out.println(map.get(ob1));
		
		
		
		
		
		
		
		
		
		
		List<String> list = Arrays.asList("First","1one","two","3three",
				"55ghh","twewl","89jsgjgs");
		
		
		System.out.println(list.stream().filter(s->!s.isEmpty() && Character.isDigit(s.charAt(0)))
		.collect(Collectors.toList()));
		
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		//[Facebook, Twitter, YouTube, WhatsApp, LinkedIn]
		
		System.out.println(listOfStrings.stream().collect(Collectors.joining(", ", "[", "]")));
		
		String input = "java iis best";
		
		Character cc=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1)
				.map(e->e.getKey())
				.skip(1)
				.findFirst().get();
		System.out.println(cc);
		
		String a="abc";
		String b="abc";
		String c=new String("abc");
		System.out.println(a==b);
		System.out.println(b==c.intern());
		
		
	
		
		
	}

}
