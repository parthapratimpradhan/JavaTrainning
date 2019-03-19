package com.learn.java.d27;

public class ElectriCalReg implements Runnable{
	public Thread t;
	public SRH helper;
	
	public ElectriCalReg(){
		t = new Thread(this,"ElectriCalReg Thread");
	}
	public ElectriCalReg(SRH helper){
		t = new Thread(this,"ElectriCalReg Thread");
		this.helper=helper;
	}
	public ElectriCalReg(String threadName){
		t = new Thread(this,threadName);
	}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			synchronized (helper) {
				helper.addStudent("Electrical-"+i);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
