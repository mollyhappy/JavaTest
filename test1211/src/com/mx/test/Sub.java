package com.mx.test;

public class Sub extends Per{
	 	public Sub(){
	        setName("Sub");
	    }
	    
	    /**
	     * ��д���෽����ʵ�ֶ�̬
	     */
	    public String drink(){
	        return "�ȵ��� " + getName();
	    }
	    
	    /**
	     * ��дtoString()
	     */
	    public String toString(){
	        return "Per : " + getName();
	    }
}
