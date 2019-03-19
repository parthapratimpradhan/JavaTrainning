package com.learn.java.d26;

public class School implements Runnable {
	
	
	public Thread t;
	
	
	public School(){
		t = new Thread(this,"School Thread");
	}
	public School(String threadName){
		t = new Thread(this,threadName);
	}
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start");
//		System.out.println("Enter a number: ");
//		Scanner reader = new Scanner(System.in);
//		int n = reader.nextInt();
//		System.out.println("You entered : "+n);
//		reader.close();
		LoopHelper lh = new LoopHelper();
		
		lh.countDown();
		
		
		System.out.println(Thread.currentThread().getName()+"End");
	}

}
