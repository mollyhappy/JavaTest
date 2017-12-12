package com.mx.test2;

public class FinalTest {
	 public static void main(String[] args)  {
	        String a = "hellohellohellohellohellohello2"; 
	        final String b = "hellohellohellohellohellohello";
	        String d = "hello";
	        String c = b + 2; 
	        String e = d + 2;
	        System.out.println((a==c));
	        System.out.println((a == e));
	        System.out.println((c+""+e));
	    }
}
