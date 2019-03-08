package com.learn.java;

public class Day6 {
	
	int x =50;
	
	public void printUnicode() {
		
		char c = '\u1990';
		
		System.out.println("Unicode : "+c);
		int d = 100;
		System.out.println(" int d : "+d);
		int bs8 = 0667;
		System.out.println("Octate : "+bs8);
		
		int hexd = 0xa5;
		
		System.out.println("Hexa decimal : "+hexd);
		
		int uint = 123_4_5;
		
		//int x = 10,y =20;
		
		System.out.println("unit : "+uint);
		
		int z = this.x;
		
		String str = "\"This is a"
				+ " string cote\"";
		
		System.out.println("Str : "+str);
		int g;
		if(true)
			 g = 10;
		
		System.out.println(g);
		method2();
		
		
		for(int i = 0; i <5 ; i++) {
			
			int x = 100; // here x is created in memory
			System.out.println(" x ="+x);
			System.out.println("Address of x"+x);
			
			 x = 789;
			System.out.println(" x ="+x);
		}//here x is destroyed 
		
	}
	
	
	public void method2() {
		
		int x = 10;
		
		System.out.println(" x = "+x);
		
		
	}

}
