package com.learn.java.d27;

import java.util.ArrayList;

public class D27Main {

	public static void main(String[] args) {
//		SRH helper = new SRH();
//		
//		ElectriCalReg eg = new ElectriCalReg(helper);
//		eg.t.start();
//		
//		
//		MechanicalReg mg = new MechanicalReg(helper);
//		mg.t.start();	
//		
//		
//		try {
//			eg.t.join();
//			mg.t.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Registration complete");
//		
//		System.out.println("Registerd students are :");
//		
//		StudentRecord.getStudents();
		
		Conveyor c = new Conveyor();
		Producer p = new Producer(c);
		p.t.start();
		Producer p2 = new Producer(c,"Abcd");
		p2.t.start();
		Consumer cm = new Consumer(c);
		cm.t.start();
		
		new Producer(c,"OneLine").t.start();
		
		System.out.println("Press control-c to stop.");
		try {
			p.t.join();
			p2.t.join();
			cm.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
