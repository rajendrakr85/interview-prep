package com.order.pack;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedString {

	public static void main(String[] args) {
		//Slicing Window Algorithm
		String str="pwwkew";
		//String str="abcdabc";
		Map<Character, Integer> map=new HashMap();
		int start=0, maxLength=0, startIndex=0;
		
		for(int end=0;end<str.length();end++) {
			char ch=str.charAt(end);
			
			if(map.containsKey(ch) && map.get(ch)>=start) {      
				start=map.get(ch)+1;	
			}
			map.put(ch, end);				
			if((end-start+1)>maxLength) {
				maxLength=end-start+1;        
				startIndex=start;			
			}
		}
		System.out.println(str.substring(startIndex,startIndex+maxLength));
	}
}