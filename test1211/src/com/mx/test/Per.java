package com.mx.test;

public class Per {
	 	private String name;
	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Per(){
	    }
	    
	    public String drink(){
	        return "ºÈµÄÊÇ " + getName();
	    }
	    
	    /**
	     * ÖØÐ´toString()
	     */
	    public String toString(){
	        return null;
	    }
}
