package com.learn.java.d28;

import com.learn.java.d27.deadlock.ThreadUtil;

public class Conveyor {
	
	private String name;
	

	public synchronized String readNew() {
		ThreadUtil.sleep(1000);
		System.out.println("Got : "+name);
		System.out.println();
		return name;
	}

	public synchronized void creatNew(String name) {
		ThreadUtil.sleep(100);
		this.name = name;
		System.out.println("Put : "+name);
	}


}
