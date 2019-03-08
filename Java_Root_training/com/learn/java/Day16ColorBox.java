package com.learn.java;

public class Day16ColorBox extends Day16Box {
	
	private String color = "WHITE";
	String matarial = "aloy";
	
	Day16ColorBox(float w,float h,float d,String color){
		super(w,h,d);
		// how to get 
		System.out.println("parent default Matarial :"+matarial);	
		System.out.println("Matarial :"+this.matarial);	
		this.matarial = "IRON";
		System.out.println("Matarial :"+this.matarial);
		System.out.println("New Day16ColorBox created : ");
		System.out.println("Defaukt color : "+this.color);
		this.color = color;
	}
	
	Day16ColorBox(float w,float h,float d,String color, String matarial){
		super(w,h,d);
		// how to get 
		System.out.println("parent default Matarial :"+super.matarial);	//this.matarial
		System.out.println("Matarial :"+this.matarial);	
		this.matarial = "IRON";
		System.out.println("Matarial :"+this.matarial);
		System.out.println("New Day16ColorBox created : ");
		System.out.println("Defaukt color : "+this.color);
		this.color = color;
	}
	
	
	public void chieldMethod(){
		System.out.println("I am called from chieldMethod");
	}

}
