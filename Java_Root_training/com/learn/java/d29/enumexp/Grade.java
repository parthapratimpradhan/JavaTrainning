package com.learn.java.d29.enumexp;

public enum Grade {
	
	
	O(91,100),E(81,90),A(71,80),B(61,70),C(51,60),D(41,50),F(0,40);
	
	// above 90 -  O
	// above 80 -  E
	// above 70 -  A
	// above 60 -  B
	// above 50 -  c
	// above 40 -  D
	// below 40 -  F
	
	Grade(int min, int max){
		this.minValue = min;
		this.maxValue = max;
	}
	
	private int minValue;
	
	private int maxValue;
	
	
	public static Grade valueOf(int number){
		for(Grade g:Grade.values()) {
			if(number<=g.maxValue && number>=g.minValue) {
				return g;
			}
		}
		throw new NumberFormatException("Number should be betwwen 0 to 100");
	}
	
	
	public enum Pointer {
		
		TEN,NINE,EIGHT;
		
		
	}


}
