package com.learn.test.java;

public class MyThreadCalculator extends Thread {
	
	MyThreadCalculator(){
		super("My Thread Calculator");
	}
	
	
	public int add(int a, int b){
		return a+b;
	}
	
	public void run() {
		System.out.println("Run thread :"+Thread.currentThread());
	}
	
}
