package com.learn.java.d33genericss;

import java.util.List;

public class Gen<T> { //Gen<T> this is a raw type
	
	int x = 10;
	String str = "Hello generic";
	private T ob;
	
	public Gen(T ob) {
		this.ob =ob;
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

	
	List<Integer> d;
	
}

