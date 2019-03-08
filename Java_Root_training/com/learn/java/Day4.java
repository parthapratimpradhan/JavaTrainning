package com.learn.java;

public class Day4 {
	
	int z = 100;
	
	public void day4test() {
		int x ; //dec
		
		x = 100;// inital
		
		if( x < 100 ) { // < , > , ==
			System.out.println("x lt 100");
			
		}
		
		// if(true/false)
		
		if(true)
			System.out.println("thos is a single line under if");
		
		for( ; x<110; x++) {
			System.out.println("Value of x : "+ x+z+" and the "+ z);
			
		}
		
		String str = "test"+"5"+89+45;
		//System.out.println(y);
		
		//for ()
	}
	
	public int add(int x, int y) {
		int sum = x+y;
		return sum;
		//System.out.println(x);
	}
	
	public MathResult devide(int x, int y) {
		MathResult res = new MathResult();
		//int res =0;
		if(y!=0) {
			res.setResult(x/y);
		}else {
			res.setResult("INF");
		}
		return res;
		//System.out.println(x);
	}

}
