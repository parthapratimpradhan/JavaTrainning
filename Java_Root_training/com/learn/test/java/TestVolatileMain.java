package com.learn.test.java;


public class TestVolatileMain {

	public static void main(String[] args) {
		
		TestVolatile v1 = new TestVolatile();
		
		Thread t1 = new Thread(v1);
		
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		v1.done = true;
		System.out.println("Now done with : "+v1.i);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Now done with : "+v1.i);
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Program end!!!");

	}

}
