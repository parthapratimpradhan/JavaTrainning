package com.learn.java;

import java.math.BigDecimal;

import javafx.util.converter.BigDecimalStringConverter;

public class Day5 {
	
	final double PI_VALUE = 4.34;
	int x;
	
	
	public void calculateAreOfAcircle(float r) {
		//pi*r*r;
		final double PI_VALUE;
		
		double pi = 3.141457788;
		System.out.println("pi:"+pi);
		System.out.println("Area of circle :"+3.141457788*r*r);
		
		BigDecimal bg = new BigDecimal(2112221222);
		
		float f1 = (float)2112221222.12345678;
		
		double d1 = 2112221222.12345678;;
		System.out.println("Float value :"+f1);
		System.out.println("Double value :"+d1);
		
		char x = '8';
		
		System.out.println("88 is now :"+x);
		
		Character y = 'H';
		//System.out.println(y.);
		
		
		System.out.println(PI_VALUE);
		
	}

}
