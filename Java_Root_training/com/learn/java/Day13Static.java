package com.learn.java;

public class Day13Static {
	
	
	public static void checkStatic() {
		
		String x = new String("");
		System.out.println("before testStaticMethod :");
		Day12StaticCheck.testStaticMethod();
		Day12StaticCheck.testStaticMethod();
		Day12StaticCheck.testStaticMethod();
		Day12StaticCheck.x=12;
		//Day12StaticCheck.y;
		
		Day12StaticCheck d13 = new Day12StaticCheck();
		
		d13.testNonStaticMethod();
		d13.y=16;
		
		d13 = null;
		
		System.out.println("Before null when we have a referance");
		d13.testStaticMethod();
		//d13.testNonStaticMethod(); //this is a null pointer
		System.out.println("After null when we don't have a referance");
		
		
		System.out.println("Passed:"+("as".equals(x)));
		
	}

}
