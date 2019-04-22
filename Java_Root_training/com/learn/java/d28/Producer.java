package com.learn.java.d28;

import com.learn.java.d27.deadlock.ThreadUtil;

public class Producer implements Runnable{
	public Thread t;
	public Conveyor c;
	public String name = "Iteam";
	
	public Producer(Conveyor c){
		t = new Thread(this,"Producer Thread");
		this.c = c;
	}
	
	public Producer(Conveyor c, String name){
		t = new Thread(this,"Producer Thread");
		this.c = c;
		this.name=name;
	}

	
	
	@Override
	public void run() {
		int i =1;
		while(true) {
			c.creatNew(name+"-"+i++);
			//ThreadUtil.sleep(100);
		}
		
		
	}
	

}
