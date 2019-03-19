package com.learn.test.java;

public class CountDownThread implements Runnable {
	
	public Thread t;
	public int sleepTime = 1000;
	public static int start = 5;
	public LoopHelper lh;
	
	CountDownThread(){
		t = new Thread(this,"Count Down Thread");
	}
	
	CountDownThread(String threadName){
		t = new Thread(this,threadName);
	}

	@Override
	public void run() {
		//countDown();
		if(lh != null) {
			lh.loopUp();
		}
	}

}
