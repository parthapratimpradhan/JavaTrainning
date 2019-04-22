package com.learn.java.d35genericss;

public class GenRestriction<T> {
	
	T ob;
	
	static T ob2;
	
	T vals[];
	
	GenRestriction(){
		
		//ob = new T();
		
		//vals = new T[10];
		
	}
	
	
	GenRestriction(T[] nums){
		
		//ob = new T();
		
		//vals = new T[10];
		
		vals = nums;
	}
	
	static T getob() {
		//return ob2;
		return null;
	}

}
