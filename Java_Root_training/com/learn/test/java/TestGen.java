package com.learn.test.java;

public class TestGen<T> { //TestGen<T> this is a raw type
	
	int x = 10;
	String str = "Hello generic";
	private T ob;
	
	public TestGen() {
	}
	
	public TestGen(int i) {
		x =i;
	}
	
	
	void setGenericData(T t){
		ob =t;
	}
	
	T getGenericData() {
		return ob;
	}
	
	
	public void showType() {
		System.out.println("Type of T is "+ob.getClass().getName());
	}
	
	void printGenericData(T d) {
		System.out.println(d);
	}

}
