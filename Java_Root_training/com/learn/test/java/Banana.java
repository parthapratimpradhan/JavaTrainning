package com.learn.test.java;

public class Banana implements PrintClassName{
	
	public void testMeThread(){
		System.out.println("Test me thread");
	}

	@Override
	public void print() {
		PrintClassNameImpl p = new PrintClassNameImpl(this);
		p.print();
	}

}
