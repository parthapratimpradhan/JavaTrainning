package com.learn.java.d27;

public class Consumer implements Runnable{
	public Thread t;
	public Conveyor c;
	
	public Consumer(Conveyor c){
		t = new Thread(this,"Consumer Thread");
		this.c=c;
	}

	@Override
	public void run() {
		while(true) {
			c.readNew();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
