package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupOfAnagram {

	public static void main(String[] args) {
		String[] ss= {"eat","ate","tan","ant","tea","bat"};
		System.out.println(groupOfAnagrams(ss));
	}
	public static ArrayList<String> groupOfAnagrams(String[] strings){
		
		if(strings.length==0)
			return new ArrayList<String>();
		
		int[] count=new int[26];
		var map=new HashMap<String, List>();
		
		for(String str:strings) {
			Arrays.fill(count, 0);
			
			for(char c:str.toCharArray()) {
				count[c-'a']++;
			}
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<26;i++) {
				sb.append("#");
				sb.append(count[i]);
			}
			
			String key=sb.toString();
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str);
		}
		return new ArrayList(map.values());
	}
}
