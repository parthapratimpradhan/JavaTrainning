package com.learn.java.d35genericss;

public class GenericsMethod {
	
	static <T extends Comparable<T>, V extends T> boolean isIn(T[] x,  V y) {
		
		
		showType(x);
		
		showType(y);
		
		for(T ti : x) {
			if(ti==y)
				return true;
		}
		
		return false;
	}
	
	
static <T, V extends T> boolean isInThis(T x,  V[] y) {
		
		
		showType(x);
		
		showType(y);
		
		for(V ti : y) {
			if(ti==y)
				return true;
		}
		
		return false;
	}
	
	public static <T> void showType(T ob) {
		System.out.println("Type of T is "+ob.getClass().getName());
	}

}
