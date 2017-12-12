package com.mx.test;

public class Sup extends Per{
	 public Sup(){
	        setName("Sup");
	    }
	    
	    /**
	     * 重写父类方法，实现多态
	     */
	    public String drink(){
	        return "喝的是 " + getName();
	    }
	    
	    /**
	     * 重写toString()
	     */
	    public String toString(){
	        return "Per : " + getName();
	    }
}
