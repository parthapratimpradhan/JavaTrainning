package com.learn.java.d27;

public class D27Main {

	public static void main(String[] args) {
		SRH helper = new SRH();
		
		ElectriCalReg eg = new ElectriCalReg(helper);
		eg.t.start();
		
		
		MechanicalReg mg = new MechanicalReg(helper);
		mg.t.start();	
		
		
		try {
			eg.t.join();
			mg.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Registration complete");
		
		System.out.println("Registerd students are :");
		
		StudentRecord.getStudents();

	}

}
