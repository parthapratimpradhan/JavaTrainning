package com.learn.java;

public class Day15{

public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do more..");
		
		System.out.println("Java day 15");
		
		System.out.println("");
		
		
		//int[] numbers = {10,20,30,40};
		
		//System.out.println("Sum is :"+addAllVargs(10,20,30,40));
		//System.out.println("Two arguments call sum is :"+addAllVargs(10,20));
		System.out.println("One arguments call sum is:"+addAllVargs());
		
		var x = "This is a string";
		
		var dObj = new Day8();
		
}


public static int addAll(int[] nums) {
	int sum =0;
	for(int num:nums) {
		sum+=num;
	}
	return sum;
}

public static int addAllVargs(int ...nums) {
	
	System.out.println("only vargs");
	int sum =0;
	System.out.println("Length of : "+nums.length);
	for(int num:nums) {
		sum+=num;
	}
	return sum;
}

public static int addAllVargs(int addWithh,int ...nums) {
	System.out.println("overloaded vargs");
	int sum =0;
	System.out.println("Length of : "+nums.length);
	for(int num:nums) {
		sum+=num;
	}
	return sum;
}


}


