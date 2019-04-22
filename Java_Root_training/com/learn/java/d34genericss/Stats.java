package com.learn.java.d34genericss;

public class Stats<T extends Number> {
	
	T[] nums;
	
	
	Stats(T[] nums){
		this.nums = nums;
	}
	
	
	double average() {
		double sum = 0.0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	
	boolean compareAvg(Stats<?> ob) {
		ob.showType();
		if(this.average()==ob.average()) {
			return true;
		}
		return false;
	}
	
	public void showType() {
		System.out.println("Type of T is "+nums[0].getClass().getName());
	}

}
