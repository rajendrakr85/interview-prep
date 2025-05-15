package com.pack.box;

public class PrintBracket {

	public static void main(String[] args) {
		generateBraces(3);
	}

	public static void generateBraces(int n) {
		generateBracesRecursiv("", 0, 0, n);
	}
	
	private static void generateBracesRecursiv(String current, int open, int close, int max) {
		if(current.length()	== max*2) {
			System.out.println(current);
			return ;
		}
		
		if(open < max) {
			generateBracesRecursiv(current+"{", open+1, close, max);
		}
		
		if(close < open) {
			generateBracesRecursiv(current+"}", open, close+1, max);
		}
	}
}
