package com.pack;

public class CheckAnagram {

	public static void main(String[] args) {
			System.out.println(testAnagram("tan", "antf"));
	}
	public static boolean testAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		for(char c:s1.toCharArray()) {
			if(s2.indexOf(c)==-1) {
				return false;
			}
		}
		
		return true;
	}
}
