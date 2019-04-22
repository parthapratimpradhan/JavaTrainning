package com.learn.java.d28;

import com.learn.java.d28.Consumer;
import com.learn.java.d28.Conveyor;
import com.learn.java.d28.Producer;

public class D28Main {
	
	public static void main(String[] args) {
		
		
		Conveyor c = new Conveyor();
		Producer p = new Producer(c);
		p.t.start();
		//Producer p2 = new Producer(c,"Abcd");
		//p2.t.start();
		Consumer cm = new Consumer(c);
		cm.t.start();
		
		System.out.println("Press control-c to stop.");
		try {
			p.t.join();
		//	p2.t.join();
			cm.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("END.");
	}

}
