package com.mx.test;

public class Sup extends Per{
	 public Sup(){
	        setName("Sup");
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
