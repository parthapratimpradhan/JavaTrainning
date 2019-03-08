package com.learn.java.d17override;

public class Triangle extends Shape implements Cloneable{
	
	
	private double s1;
	private double s2;
	private double s3;
	private double b;
	private double h;
	
	public Triangle(double s1, double s2, double s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double area(){
		//super.area();
		System.out.println("Area of Triangle");
		findBandH();
		area = 0.5*b*h;
		return area;
				
		}

	private void findBandH() {
		b = s1;
		h = s2+s3/2; // just try 
	}
	
	public double getBase() {
		return b;
	}
	
	public double getHeight() {
		return h;
	}
	
	
	public Triangle clone() throws CloneNotSupportedException{
		return (Triangle)super.clone();
	}

	public Triangle getClone() throws CloneNotSupportedException {
		return clone();
	}
}
