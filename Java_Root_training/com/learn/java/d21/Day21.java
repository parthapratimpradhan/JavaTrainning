package com.learn.java.d21;

import com.learn.java.d20.TaxCalculator;



public class Day21 implements InterfaceVAriables {
	
	public final static void testStatic() {
		System.out.println("testStatic called");
	}
	
	public void test() {
		//NO = 9; // interface variables are static and final so can't be change
		System.out.println(NO);
		
	}

	@Override
	public void testInterface() {
		//TaxCalculator.myCalculatorStartYear();
		System.out.println(InterfaceVAriables.LATER);
		// TODO Auto-generated method stub
		
	}
	

}
