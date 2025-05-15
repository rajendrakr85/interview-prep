package com.pack.box;

import java.util.Stack;

public class Decode {

	public static void main(String[] args) {
		String str1="3[a]2[b]3[c]"; //aaabbccc
		String str2="3[a2[b3]c]";   //  abbcabbcabbc

		System.out.println(decode(str1));
		System.out.println(decode(str2));
	}
	public static String decode(String str) {
		Stack<Integer>countStack=new Stack();
		Stack<StringBuilder>strStack=new Stack();
		
		StringBuilder current=new StringBuilder();
		int k=0;
		
		for(char ch:str.toCharArray()) {
			if(Character.isDigit(ch)) {
				k=k*10+ ch-'0';
				System.out.println("::: "+k);
			}else if(ch=='[') {
				countStack.push(k);
				strStack.push(current);
				System.out.println("=== "+current);
				current=new StringBuilder();
				k=0;
			}else if(ch==']') {
				StringBuilder decoded=strStack.pop();
				int count=countStack.pop();
				System.out.println("+++ "+current);
				while(count-->0) {
					decoded.append(current);
				}
				current=decoded;
			}else {
				current.append(ch);
				System.out.println("--- "+ch);
			}
		}
		
		return current.toString();
	}

}
