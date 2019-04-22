package com.learn.java.d35genericss;

public class MyGenAmbiguity<T extends Number,V> {
	
	T ob1;
	V ob2;
	
	
	void set(T o) {
		ob1=o;
	}
	
	
	void set(V o) {
		ob2 = o;
	}

}
