package com.learn.java.d27;

public class SRH {
	
	public void addStudent(String name){
		
			StudentRecord.addStudent(name);
			System.out.println("inside sync");
		
		System.out.println("after sync");
		
	}

}
