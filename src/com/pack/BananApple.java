package com.pack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BananApple {

	public static void main(String[] args) {
			List<String>fruits=Arrays.asList("apple:2","banana:3","apple:4");
			
			fruits.stream().map(fr->fr.split(":"))
				.collect(Collectors.groupingBy(ar->ar[0],
						Collectors.summingInt(ar->Integer.parseInt(ar[1])))).forEach((key,value)->System.out.println(key+" "+value));;
	}

}
