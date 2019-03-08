package com.learn.java;

public class Day12Recur {
	
	int i = 0;
	
	int recursive(int j) {
		i++;
		
		int mNum = j++;
		System.out.println("recursive m Num "+mNum);
		//System.out.println("i + "+i);
		
		if(i==3) {
			System.out.println("first return from line 2");
			return i;
		}
		
		int x = recursive(mNum);
		
		
		//System.out.println("x return from previous call = "+ x);
		
		//System.out.println("below return return from line 7");
		return i;
	}
	
	
	
	void recursiveBasic(int j) {//j = 0 on start
		
		int mNum = j+1;
		
		//System.out.println("recursive m Num "+mNum);
		
		//last return logic
		if(mNum>=3) {
			return;
		}
		
		recursiveBasic(mNum);
		
		System.out.println("recursive m Num after :"+mNum);
		return;
		
		
		
	}
	
	
	
	long rFact(int n){
		if(n == 1) {
			return 1;
		}
		
		long fact = n*rFact(n-1);
		
		return fact;
	}

}











