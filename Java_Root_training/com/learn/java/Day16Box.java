package com.learn.java;

public class Day16Box {
	
	private float w;
	private float h;
	private float d;
	
	protected String matarial = "COPOR";
	
	Day16Box(float w,float h,float d){
		System.out.println("New Day16Box contructor Called : ");
		this.w=w;
		this.h=h;
		this.d=d;
	}
	
	public float getVol() {
		//box.d += 10;
		System.out.println("w = "+w+", h = "+h+", d = "+d);
		float volm = this.d*this.h*this.w;
		System.out.println("vol = "+volm);
		return volm;
	}
	

}
