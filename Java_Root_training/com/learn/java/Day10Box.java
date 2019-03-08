package com.learn.java;

public class Day10Box {
	
	float w;
	float h;
	float d;
	
	Day10Box(){
		System.out.println("New Day10Box created : ");
		
	}
	
	float getVol(Day10Box box) {
		
		//box.d += 10;
		System.out.println("w = "+w+", h = "+h+", d = "+d);
		float volm = box.d*box.h*box.w;
		
		System.out.println("vol = "+volm);
		return volm;
		
		
	}
	

}
