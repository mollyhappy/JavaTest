package com.mx.test5;

public class PerTest extends SunTest{
	static
    {
        System.out.println("PerTest init!");
    }
 
    public static int value = 123;
 
    public PerTest()
    {
        System.out.println("init PerTest");
    }
}
