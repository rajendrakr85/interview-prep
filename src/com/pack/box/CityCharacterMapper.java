package com.pack.box;

import java.util.*;
import java.util.stream.*;

public class CityCharacterMapper {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Chennai", "Hyderabad", "Kolkata", "Goa");
        
        int maxLength=cities.stream().mapToInt(String::length).max().getAsInt();
        
        List<String> revCities=IntStream.range(0, maxLength)
        	.mapToObj(pos->cities.stream()
        			.map(city->pos<city.length() ? String.valueOf(city.charAt(pos)):"")
        			.collect(Collectors.joining()))
        			.collect(Collectors.toList());
        
        //System.out.println(revCities);
        
        IntStream.range(0, maxLength)
        		.mapToObj(pos->cities.stream()
        					.map(city->pos<city.length()?String.valueOf(city.charAt(pos)):"")
        					.collect(Collectors.joining(",")))
        					.collect(Collectors.toList()).forEach(System.out::println);
    }
}