package com.mx.test3;

public class Test {
	 	Person person = new Person("Test");
	    static{
	        System.out.println("test static");
	    }
	     
	    public Test() {
	        System.out.println("test constructor");
	    }
	     
	    public static void main(String[] args) {
	        new MyClass();
	    }
}
