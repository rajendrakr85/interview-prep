package com.pack.qn100;

public class SwitchEnhanceMentJava14 {

	public static void main(String[] args) {
		
		String str="rajan11";
		String sw=switch(str) {
			case "rajan","rajan11"->"this is rajedra kumar";
			case "sarthak"->"this is sarthak kumar";
			case "sushama"->"this is sushama kumari";
			default -> "option not available";
		};
		System.out.println(sw);
	}

}
