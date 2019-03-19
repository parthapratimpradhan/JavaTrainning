package com.learn.test.java;

public class LearnException {
	
	public int fiveBy(int i) {
		System.out.println("fiveBy called");
		int x=0;
		try {
			x=5/i;
			
			return x;
			//throw new Exception("error Devide by zero");
			
		}catch(ArithmeticException e) {
			System.out.println("Exception :"+e);
			//throw new ArithmeticException("error Devide by zero");
		}finally {
			System.out.println("finally x :"+x);
		}
		System.out.println("fiveBy end");
		return x;
	}

}
