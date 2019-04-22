package com.learn.java.d32transient;

class Demo implements java.io.Serializable 
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = -8858368242804060616L;
	public int a; 
    transient public String b; 
    
  
    // Default constructor 
    public Demo(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 

