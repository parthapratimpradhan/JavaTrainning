package com.learn.java;

import com.learn.java.d26.School;
import com.learn.java.d26.SchoolGround;

public class BasicMainPage {
	
	public int x = 100;


	
//	
//	private static AdvanceCalculator getMeOfcCalculator() {
//		return new MyOfficeCalculator();
//	}
//
//	private static AdvanceCalculator getMeAdvCalculator() {
//		return new MyCollegeCalculator();
//	}
//
//	private static BasicCalculator getMeCalculator() {
//		return new MathCalculator();
//	}
//	
	public static void main(String[] args) {
		
//		Day 26 :
		
		//Apple a2 = new Apple();
		//a2.print();
		
		
		// Extends PrintClassName
		// implilments PrintInterface
		
		
		
		
		SchoolGround sg = new SchoolGround();
		//sg.setName("SchoolGround");
		//sg.start();
		
		School s1 = new School("School Thread1");
		s1.t.setPriority(10);
		s1.t.start();
		
		School s2 = new School("School Thread2");
		s2.t.setPriority(6);
		s2.t.start();
		
		School s3 = new School("School Thread3");
		s3.t.setPriority(1);
		s3.t.start();
		
		
		
		
		
		
		System.out.println("s1.t.isAlive() : "+s1.t.isAlive());
		
		
		try {
			
			
			
			
			
			s1.t.join();
			s2.t.join();
			s3.t.join();
			
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("s1.t.isAlive() : "+s1.t.isAlive());
		System.out.println("Program end");
		
		
		
		//====================================
		
		//System.out.println(x);
		
//		Day3 d3 = new Day3();
//		
//		d3.add(4, 5);
//		
//		
//		d3.add("Test","Page");
//		
//		Day4 d4 = new Day4();
//		
//		d4.day4test();
//		
//		MathResult res = d4.devide(6, 3);
//		System.out.println("6/3 is ");
//		if(res.getStatus().equals("SUCCESS")) {
//			System.out.println("Res : "+res.getResult());
//		}else {
//			System.out.println("Res : "+res.getStatus());
//		}
//		
//		
//		res = d4.devide(6, 0);
//		System.out.println("6/0 is ");
//		if(res.getStatus().equals("SUCCESS")) {
//			System.out.println("Res : "+res.getResult());
//		}else {
//			System.out.println("Res : "+res.getStatus());
//		}
		
		
//		Day5 d5 = new Day5();
//		
//		d5.calculateAreOfAcircle(4);
		
		
	//	Day6 d6 = new Day6();
		
	//	d6.printUnicode();ß
		
		
		//Day7 d7 = new Day7();
		
		
		//d7.autoconversion();
		
		
		//Day8 d8 = new Day8();
		
		//d8.checkMod();

		//Day9 d9 = new Day9();
		
		//d9.javaLoops();
		
		//d9.ki = 100;
		
		//Day10 d10 = new Day10();
		
		//d10.day10();
		//System.out.println("in main method 1");
		//Day10Box box2 = new Day10Box();
		
		//float vol=box2.getVol(box2);
		//if(vol >1000) {
		//	System.out.println("Call to put 1l oil");
			
		//}
		
		
		//Day11 d11 = new Day11();
		
		//d11.testDay11();
		
		
		//Day12Stack st = new Day12Stack(5);
		//System.out.println("Stack object = "+st);
		//System.out.println(st.stackArr.length);
		//st.push(0);
		
		
		//Day12Recur d12r = new Day12Recur();
		
		//d12r.recursive(0);
		//d12r.recursiveBasic(0);
//		long startTime = System.currentTimeMillis();
//		long res =d12r.rFact(30);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Time taken = "+(endTime-startTime));
//		System.out.println("result "+res);
		
		
		//System.out.println("Before call");
		//Day13Static.checkStatic();
		
		
		//Day14NesetedClass d14 = new Day14NesetedClass();
		
		//d14.checkDay14();
		//Day14NesetedClass.Chield ch = d14.getChieldObject();
		
		//ch.chieldMethod();
		
		
		
//		Day16C d16 = new Day16C();
//		
//		d16.printIandJ();
//		d16.addijk();
//		var x = d16.i;
//		
//		Day16Box d16box = new Day16Box(10, 10,10);
//		
//		
//		d16box.getVol();
//		
//		
//		Day16ColorBox d16cbox = new Day16ColorBox(20, 20, 20, "RED");
//		d16cbox.getVol();
//		d16cbox.chieldMethod();
//		
//		Day16Box b2 = new Day16ColorBox(20, 20, 20, "GREEN");
//		//b2.chieldMethod();
		//Day16ColorBox 
		
		
		//Day16C2 d116Const = new Day16C2();
		
		//Day14NesetedClass d14c = new Day14NesetedClass();
		
		//d14c.checkDay14();
		
		
		//Shape s1 = new Shape();
		//System.out.println(s1.area());
		
		//Triangle t1 = new Triangle(3, 4, 5);
		//System.out.println(t1.area());
		
		//System.out.println("Base : "+t1.getBase());
		
		
		//Square sq1 = new Square(5);
		//System.out.println(sq1.area());
		
		//System.out.println("Shape area using Triangle Object");
		//Shape s2 = new Triangle(3, 4, 5);
		//System.out.println(s2.area());
		
		//Shape s3 = new Shape();
		//Triangle t2 = new Triangle(3, 4, 5);
		//System.out.println(s3.area());
		//s3 = t2;
		//System.out.println(s3.area());
		//System.out.println(t2.area());
		//Shape s4 = new Triangle(3, 4, 5);
		//System.out.println(s4.area());
		
		//Object o1 = new Triangle(3, 4, 5);
		//System.out.println(o1.area());
		
		//Triangle t3 = (Triangle) s4;
		//System.out.println(t3.area());
		
		//s4 = new Square(5);
		//Square t4 = (Square) s4;
		//System.out.println(t4.area());
		
		
		//RShape r1 = (RShape) s3;
		//System.out.println(r1.area());
		
		//System.out.println("Base : "+s2.getBase()); //Wrong
		
//		Triangle t5 = new Triangle(3, 4, 5);
//		Triangle t7 = null;
//		try {
//			 t7 = t5.getClone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(t7 != t5) {
//			System.out.println("clone are not same");
//			System.out.println(t5.area());
//			System.out.println(t7.area());
//		}
//		
//		C1 co = new C1();
//		co.printme("Hello India!");
		
		
		
//		BasicCalculator cal = getMeCalculator();
//		
//		System.out.println("res = "+cal.divison(12, 0));
//		
//		//XyzCalculator cal = new XyzCalculator();
//		
//		AdvanceCalculator advCal = getMeAdvCalculator();
//		System.out.println("res = "+advCal.mod(12, 0));
//		
//		AdvanceCalculator ofcCal = getMeOfcCalculator();
//		System.out.println("res = "+ofcCal.mod(12, 0));
//		
//		System.out.println("res = "+ofcCal.add(12, 13));
//		
//		System.out.println("res = "+ofcCal.add(12, 13));//ofcCal.calculateTax(1200000, 130000)
//		
//		
//		
//		TaxService ts = new TaxService(2500000, 100000);
//		TaxCalculator mhecal = new MheOfficeCalculator();
//		AdvanceCalculator advMhe = (AdvanceCalculator)mhecal;
//		System.out.println(ts.calculateTax(mhecal));
//		System.out.println(advMhe.add(10, 20));
//		TaxCalculator trical = new TriconOfficeCalculator();
//		System.out.println(ts.calculateTax(trical));
//		
//		
//		System.out.println(InterfaceVAriables.LATER);
//		InterfaceVAriables.myCalculatorStartYear();
//		
//		//Day21.myCalculatorStartYear(); // interface static method dose not inherit to implemented class 
//		
//		int c = Day21.NO;
//		
//		Day21.testStatic();
//		
//		Day21Ch.testStatic();
		
		
//		System.out.println("before try block");
//		int x=0;
//		int y=5;
//		int z;
//		try {
//			//inside try block
//			System.out.println("inside try block");
//			z=y/x;
//			System.out.println("inside try block after error code");
//		}catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("inside catch block");
//		}finally {
//			System.out.println("inside finaly block");
//		}
//		
//		System.out.println("after finaly block");
//		int[] A = new int[12];
//		
//		System.out.println(A.length);
		
		
//		LearnExp1 l1 = new LearnExp1();
//		System.out.println();
//		System.out.println("Before test me called");
//		System.out.println();
//		
//		try {
//			l1.testMe(9);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("After test me called");
		
		
//		
//		ExceptionWIthFinally e1 = new ExceptionWIthFinally();
//		
//		try {
//			e1.testFinally();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			e1.checkStudentHelth();
//		} catch (MyStudentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		FewMoreOnExceptions d24 = new FewMoreOnExceptions();
//		
//		
//		try {
//			System.out.println(d24.testChainException(Integer.parseInt(args[0])));
//			
//		} catch (NumberFormatException | IOException e) {
//			System.out.println("getcause : "+e.getCause());
//			System.out.println("NumberFormatException : ");
//			System.out.println();
//			e.printStackTrace();
//			
//		}catch (Exception e) {
//			System.out.println("getcause : "+e.getCause());
//			System.out.println("NumberFormatException : ");
//			System.out.println();
//			e.printStackTrace();
//		}
		
	//	ThreadingDemo t = new ThreadingDemo();
	//	t.myThreadRunning();
		
	}
	
}
