package com.pack;

public class LowerUpper {

	public static void main(String[] args) {
		StringBuilder lower=new StringBuilder();
		StringBuilder upper=new StringBuilder();
		
		String str="RaJeNdRA";
		int i=0;
		while(i<str.length()) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper.append(str.charAt(i));
			}else {
				lower.append(str.charAt(i));
			}
			i++;
		}
		System.out.println((lower.append(upper)));
	}

}
