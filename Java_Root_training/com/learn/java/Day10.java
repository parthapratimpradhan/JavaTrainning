package com.learn.java;

public class Day10 {

	
	public void day10() {
		
		Day9 d1 = new Day9();
		d1.ki = 100;
		
		Day9 d2;
		
		d2 = d1;
		
		d1 = null;
		
		Day9 d3 = new Day9();
		
		d3.ki = 200;
		
		d2 = d3;
		
		d3 = new Day9();
		
		d3.ki = 500;
		
		//d2.ki? 500;
		
		System.out.println("d2 ki = "+d2.ki);
		System.out.println("d3 ki = "+d3.ki);
		System.out.println("d1 : "+d1+", d2 : "+d2);
		
		System.out.println("in day10 method 2");
		Day10Box box = new Day10Box();
		
		box.d =10;
		box.h =10;
		box.w =10;
		
		
		box.getVol(box);
		
		System.out.println("in day10 method 3");
		Day10Box box2 = new Day10Box();
		box2.d =1;
		box2.h =1;
		box2.w =1;
		//float vol = box.d*box.h*box.w;
		System.out.println("Box2 vol :");
		box2.getVol(box2);
		System.out.println("Box2 vol again after first call:");
		box2.getVol(box2);
	}
	
	
}
