package com.learn.test.java;

import java.util.Scanner;

public class MyCalculator implements Runnable{
	
	
	public int add(int a, int b){
		return a+b;
	}

	@Override
	public void run() {
		
		System.out.println("Enter a number: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println("You entered : "+n);
		reader.close();
		
	}

}
