package com.learn.java.d26;

public class PrintClassNameImpl implements ClassNamePrintInterface {
	
	ClassNamePrintInterface obj = null;
	PrintClassNameImpl(){
		
	}
	PrintClassNameImpl(ClassNamePrintInterface obj){
		this.obj = obj;
	}
	
	public void print() {
		if(obj != null) {
			System.out.println(obj.getClass().getName());
		}else {
			System.out.println(this.getClass().getName());
		}
	}
}
