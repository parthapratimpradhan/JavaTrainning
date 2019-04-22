package com.learn.test.java;

public class TestVolatile implements Runnable{
	
	int i = 1;
	
	volatile boolean done;

	@Override
	public void run() {
		done = false;
		
		//while(!isDone()) {
		while(!done) {
			i++;
			//System.out.println("Running thread "+Thread.currentThread());
		}
		System.out.println("i = "+i);
		System.out.println("Last line of thread "+Thread.currentThread());
	}

	private synchronized boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
	
	
	
	

}
