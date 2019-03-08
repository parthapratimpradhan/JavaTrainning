package com.learn.java.d21;

public interface InterfaceVAriables {
	
	static int NO = 0;
	int YES = 1;
	int MAYBE = 2;
	int LATER = 3;
	int SOON = 4;
	int NEVER = 5;
	
	void testInterface();
	
	
	default void checkFY() {
		System.out.println("18-19");
	}
	
	public static void myCalculatorStartYear() {
		
		System.out.println("2019");
	}


}
