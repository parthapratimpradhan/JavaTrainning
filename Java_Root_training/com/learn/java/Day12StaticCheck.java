package com.learn.java;

public class Day12StaticCheck {

	static int x;
	int y;
	
	static {
		System.out.println("Static block called:");
		int v = 12;
		x =10+v;
		
	}
	
	static void testStaticMethod() {
		
		System.out.println("testStaticMethod called");
	}
	
	static void testStaticMethod2() {
		System.out.println("testStaticMethod2 called");
		Day12StaticCheck.testStaticMethod();
	}
	
	void testNonStaticMethod() {
		Day12StaticCheck.testStaticMethod2();
		System.out.println("testNonStaticMethod called");
	}
}
