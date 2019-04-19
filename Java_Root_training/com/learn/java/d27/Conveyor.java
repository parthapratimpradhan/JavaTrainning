package com.learn.java.d27;

public class Conveyor {
	
	private String name;
	
	private boolean valueSet;

	public synchronized String readNew() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Thread.currentThread().getState();
		System.out.println("Got : "+name);
		System.out.println();
		setValueSet(false);
		notify();
		return name;
	}

	public synchronized void creatNew(String name) {
		while(valueSet) {
			try {
				wait();
				
				//p1 is waiting 
				//p2 is waiting 
				//lets say after notify p1 start
				// if there is no loop condition then it will go to create new directly
				// as soon as p1 exit p2 start and if there is no loop condition it will 
				//also start creating new withot checlkinf if it is consumed or not
				// so when we use while it will check every time it try to go out of the loop
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = name;
		setValueSet(true);
		System.out.println("Put : "+name);
		notify();
	}

	public boolean isValueSet() {
		return valueSet;
	}

	private void setValueSet(boolean valueSet) {
		this.valueSet = valueSet;
	}

}
