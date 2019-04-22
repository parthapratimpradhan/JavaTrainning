package com.learn.java.d32transient;

import java.io.Serializable;

public class TestSerialize implements Serializable{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 28277315765189401L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 7787852626562304407L;
	
	
	
	int x;
	int y;
	int z;
	String name;
//	public static String schoolName;
	
	TestSerialize(int x, int y, String name){
		this.x=x;
		this.y=y;
		z =10;
		this.name=name;
	}

}
