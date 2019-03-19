package com.learn.java.d27;

public class MechanicalReg implements Runnable{

public Thread t;
public SRH helper;
	
	public MechanicalReg(){
		t = new Thread(this,"MechnicalReg Thread");
	}
	public MechanicalReg(SRH helper){
		t = new Thread(this,"ElectriCalReg Thread");
		this.helper=helper;
	}
	public MechanicalReg(String threadName){
		t = new Thread(this,threadName);
	}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			synchronized (helper) {
				helper.addStudent("MechanicalReg-"+i);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
