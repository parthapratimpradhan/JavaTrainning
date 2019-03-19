package com.learn.java.d23;

public class MyStudentException extends Exception {
	
	private Student s;
	
	MyStudentException(Student s){
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "[ MyStudentException ] for Student '"+s.name+"' RollNumber : "+s.rollNumber;
	}

}
