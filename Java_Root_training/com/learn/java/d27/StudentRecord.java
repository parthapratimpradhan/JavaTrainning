package com.learn.java.d27;

import java.util.HashMap;
import java.util.Map;

public class StudentRecord {
	
	private static Map<Integer,String> students = null;
	private static int lastKey = 0;
	

	public static Map<Integer,String> getStudents() {
			for(Integer k:students.keySet()) {
				System.out.println("RoolId : "+k+" = "+students.get(k));
			}
		return students;
	}
	
	public static String getStudent(int key) {
		return students.get(key);
	}

	public static void addStudent(String student) {
		if(students == null) {
			if(Thread.currentThread().getName().equals("ElectriCalReg Thread"))
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			students = new HashMap<Integer,String>();
		}
		StudentRecord.students.put(++lastKey, student);
		System.out.println("Added :"+student);
	}
	
	
	
	

}
