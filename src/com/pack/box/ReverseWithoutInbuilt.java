package com.pack.box;

public class ReverseWithoutInbuilt {

	public static void main(String[] args) {
		String str="rajendra";
		char[] chara=str.toCharArray();
		
		int left=0;
		int right=chara.length-1;
		
		while(left < right) {
			char temp=chara[left];
			chara[left]=chara[right];
			chara[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println(new String(chara));
	}

}
