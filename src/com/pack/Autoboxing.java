package com.pack;

public class Autoboxing {
 
    static void m1(double a){
        System.out.print("a->"+a);
    }
   static void m1(float f ){
        System.out.print("f->"+f);
    }
 
    public static void main(String[] args) {
        m1(10);
    }
}