package com.learn.java.d23;

public class ExceptionWIthFinally {

	
	public int testFinally() throws Exception {
		
		int[] x = new int[2];
		x[0]=5;
		
		try {
			System.out.println("Try start");
			//x[2] = 12;
			return 5;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In catch block");
			System.out.println(e);
			throw new Exception();
		}finally {
			System.out.println();
			System.out.println("In finally block");
			System.out.println();
		}
		
		System.out.println("after try catch finally");
		return x[0];
	}
	
	
	public void checkStudentHelth() throws MyStudentException {
		Student s = new Student();
		s.name="Mihir";
		s.rollNumber=900108;
		
		throw new MyStudentException(s);
		
	}
}
