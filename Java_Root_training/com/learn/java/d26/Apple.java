package com.learn.java.d26;

public class Apple extends F implements ClassNamePrintInterface{
	
	
	public 	int getCal(){
		return 1000;
	}

	@Override
	public void print() {
		PrintClassNameImpl p = new PrintClassNameImpl(this);
		p.print();
	}

}
