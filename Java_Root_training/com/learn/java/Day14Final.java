package com.learn.java;

public class Day14Final {
	
	final double PI = 3.14;
	
	public void checkFinalInmethod(){
		
		final double PI_IN_METHOD;
		PI_IN_METHOD = 3.141;
		//PI_IN_METHOD = 3.142;
		
		System.out.println("PI_IN_METHOD :"+PI_IN_METHOD);
		System.out.println("PI : "+PI);
	}

}
