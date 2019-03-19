package com.learn.java.d26;

import java.util.Scanner;

public class SchoolGround extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
		System.out.println("Enter a number: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println("You entered : "+n);
		reader.close();
		System.out.println(Thread.currentThread().getName()+"End");
	}
}
