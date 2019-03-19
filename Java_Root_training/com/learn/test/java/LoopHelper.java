package com.learn.test.java;

public class LoopHelper {
	public int sleepTime = 1000;
	public static int start = 5;
	
	public void countDown(){
		for(int i = start; i>0; i--) {
			System.out.println(Thread.currentThread().getName()+"= i :"+i);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void loopUp(){
		for(int i = 1; i<=start; i++) {
			System.out.println(Thread.currentThread().getName()+"= i :"+i);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
