package com.learn.java.d25;

public class ThreadingDemo {
	
	
	public void myThreadRunning(){
		Thread t = Thread.currentThread();
		t.setName("My thread");
		System.out.println("Thread : "+t);
		for (int i = 0; i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
//4 Oct 2018 image And after you approved Rs 65,000 on 6 Oct 2018 no work till 15 Mar, 19!  
}
