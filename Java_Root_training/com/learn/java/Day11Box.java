package com.learn.java;

public class Day11Box {
	
	float w;
	float h;
	float d;
	
	
	
	
	Day11Box(){
		w=10;
		h=10;
		d=10;
		System.out.println("New Day10Box created for : "+w+","+h+","+d);
	}
	Day11Box(float w, float h, float d){
		System.out.println("New Day10Box created for : "+w+","+h+","+d);
	}
	void setDim(int w, int h, int d) {
		System.out.println("int args called");
		this.w=w;
		this.h=h;
		this.d=d;
	}
	void setDim(float w, float h, float d) {
		System.out.println("float args called");
		this.w=w;
		w+=10;
		this.h=h;
		this.d=d;
	}
	
	void getVol(Day11Box box) {
		
	}
	
	float getVol() {//Day11Box box
		//float d=0;
//		if(box==this) {
//			System.out.println(" box1 passed is same as this");
//		}
		d += 10;
		System.out.println("w = "+w+", h = "+h+", d = "+d);
		float volm = d*h*w;
		
		System.out.println("vol = "+volm);
		return volm;
		
		
	}
	

}
