package com.pack.flocareer;

import java.util.Arrays;
import java.util.Scanner;

public class FlowCareerInterview {

	public static void main(String[] args) {
		int inputNo=new Scanner(System.in).nextInt();
		if(isInvalid(inputNo)) {
			System.out.println("Invalid number");
			return;
		}
		int count=0;
		
		while(inputNo != 6174) {
			inputNo = kaprekaStep(inputNo);
			count++;
			System.out.println("step :"+count+ ": "+inputNo);
		}
		
	}
	
	private static int kaprekaStep(int num) {
		String numStr=String.format("%04d", num);
		char[] digits=numStr.toCharArray();
		
		Arrays.sort(digits);
		
		int small = Integer.parseInt(new String(digits));
		
		StringBuilder descBuilder=new StringBuilder(new String(digits)).reverse();
		int large = Integer.parseInt(descBuilder.toString());
		
		return large - small;
	}
	private static boolean isInvalid(int num) {
		if(num<1000 && num >9999) {
			return true;
		}
		String s=String.valueOf(num);
		char firstChar=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=firstChar)
				return false;
		}
		return true;
	}
}
