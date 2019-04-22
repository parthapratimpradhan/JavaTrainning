package com.learn.java.d34genericss;

public class BoundedDemoMain {

	public static void main(String[] args) {
		
		
		Integer[] nums = {1,2,3,4,5};
		Stats<Integer> ist = new Stats<Integer>(nums );
		System.out.println("ist.average() :"+ist.average());
		
		
	//	String[] snums = {"1","2","3","4","5"};
	//	Stats<String> sst = new Stats<String>(snums ); //Bound mismatch

		Double[] dnums = {1.0,2.0,3.0,4.0,5.0};
		Stats<Double> dst = new Stats<Double>(dnums );
		System.out.println("dst.average() :"+dst.average());
		
		Integer[] nums2 = {1,2,3,4,5};
		Stats<Integer> ist2 = new Stats<Integer>(nums2 );
		System.out.println("ist.average() :"+ist2.average());
		
		if(ist.compareAvg(dst)) {
			System.out.println("Avg is same");
		}else {
			System.out.println("Avg is different");
		}
			
	}

}
