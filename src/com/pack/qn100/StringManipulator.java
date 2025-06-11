package com.pack.qn100;

public class StringManipulator {

	public static void main(String[] args) {
		String str1="welcome";
        String str2=new String("world");
        char[] chars= {'H','e','l','l','o'};
        String str3=new String(chars);
        
        boolean equeal1=str1.equals(str2);
        System.out.println(equeal1); //false
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println(equalsIgnoreCase); //false
        int comparable=str1.compareTo(str2); 
        System.out.println(comparable);//-11
        int compareIgnoreCase=str1.compareToIgnoreCase("HELLO");//11
        System.out.println(compareIgnoreCase);//1
        
        System.out.println("str1 "+str1);
        System.out.println("str2 "+str2);
        System.out.println("str3 "+str3);
        
        
       
	}

}
