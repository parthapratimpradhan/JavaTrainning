package com.learn.java.d17override;

public class Square extends Shape {
	
	
	private double s;
	
	
	 public Square(double s){
		this.s = s;
	}
	
	public double area(){
		System.out.println("Area of Square");
		area = s*s;
		return area;
		}

}
