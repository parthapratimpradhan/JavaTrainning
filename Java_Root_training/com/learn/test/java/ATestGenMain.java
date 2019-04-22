package com.learn.test.java;

public class ATestGenMain {

	public static void main(String[] args) {
		
		TestGen<String> g = new TestGen<String>();
		
		g.setGenericData("TEN");
		
		String strData = g.getGenericData();
		
		System.out.println("Generic Data :"+strData);
		//g.printGenericData(strData);
		g.showType();
		
		TestGen<Integer> g2 = new TestGen<Integer>();
		
		g2.setGenericData(10);
		
		int intData = g2.getGenericData();
		
		System.out.println("Generic Data :"+intData);
		//g2.printGenericData(intData);
		g2.showType();
		
		
		//g = g2; //Wrong
		//Type mismatch: cannot convert from TestGen<Integer> to TestGen<String>

	}

}
