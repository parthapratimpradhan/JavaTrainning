package com.learn.java;

public class Day11 {
	
	void testDay11() {
		
		Day11Box box1 = new Day11Box();
		//box1.w=1;
		int w =10;
		int h = 10;
		int d = 10;
		box1.setDim(1,1,1);
		box1.setDim(box1.w,1,1);
		box1.getVol();
		box1.getVol();
	}
}
