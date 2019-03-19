package com.learn.test.java;

public class PrintClassNameImpl implements PrintClassName {

	PrintClassName obj = null;
	
	public PrintClassNameImpl(){
		
	}
	
	public PrintClassNameImpl(PrintClassName obj){
		this.obj = obj;
	}
	
	@Override
	public void print() {
		if(obj != null) {
			System.out.println(obj.getClass().getName());
		}else {
			System.out.println(this.getClass().getName());
		}
	}

}
