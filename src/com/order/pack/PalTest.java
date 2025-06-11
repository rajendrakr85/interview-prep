package com.order.pack;

public class PalTest{
	public static void main(String... ar){
		String str="madam";
		int len=str.length();
		boolean flag=false;
		
		for(int i=0;i<len/2;i++){
			if(str.charAt(i)==str.charAt(len-i-1)){
				flag=true;
				continue;	
			}else{
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.print("string is palindrom");
		}else{
			System.out.print("string is not palindrom");
		}
	}
}
