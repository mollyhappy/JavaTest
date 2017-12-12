package com.mx.test4;

public class Test {
	private String title;
    private String content;
    
    private static int count = 0;
    public final static String DEFAULT_CONTENT = "这个家伙很懒，什么也没写";
    
    public Test(){
        count++;
    }
    
    public static int getCount(){
        return count;
    }
    
}
