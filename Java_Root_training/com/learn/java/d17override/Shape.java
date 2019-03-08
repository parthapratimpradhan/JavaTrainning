package com.learn.java.d17override;



public abstract class Shape {
	public double area;
	
	public abstract double area();
	
	public double sideLength() {
		double length = 0;
		return length;
	}
}

//Without abstact
//public class Shape {
//	public double area;
//	
//	public double area(){
//		System.out.println("Area of Shape");
//		return area;
//	}
//	
//	public double sideLength() {
//		double length = 0;
//		return length;
//		
//	}
//}
