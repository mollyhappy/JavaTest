package com.mx.test4;

public class Test {
	private String title;
    private String content;
    
    private static int count = 0;
    public final static String DEFAULT_CONTENT = "����һ������ʲôҲûд";
    
    public Test(){
        count++;
    }
    
    public static int getCount(){
        return count;
    }
    
}
