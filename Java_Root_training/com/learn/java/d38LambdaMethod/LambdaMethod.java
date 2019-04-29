package com.learn.java.d38LambdaMethod;

import com.learn.java.d37Lambda.EmptyArrayException;

public class LambdaMethod {
	
	public String reversFunc(String s) {
	//public static String reversFunc(String s) {
		
		String[] strar = s.split("");
		
		String reversString = "";
		
		for(String st : strar) {
			reversString = st + reversString;
		}
		
		return reversString;
		
		
		
		
	}

}
