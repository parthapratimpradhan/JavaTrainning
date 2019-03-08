package com.learn.java;

public class Day12Stack {
	private int maxSize;
	private int top;
	public int stackArr[];

	public Day12Stack(int maxSize) {
		
		System.out.println(this.maxSize);
		this.maxSize = maxSize;
		top = -1;
		stackArr = new int[maxSize];
	}

	
	
	
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack Full!!!");
		} else {
			stackArr[0] = x;
		}	
	}
	
	public int pop() {
		return stackArr[top--];
	}
	
	private boolean isEmpty() {
	    return (top == -1);
	}
	   
	private boolean isFull() {
	    return (top == maxSize - 1);
	}
//	
//	public void popAllAndPrint() {
//		while (!isEmpty()) {
//	        int value = pop();
//	        System.out.print(value);
//	        System.out.print(" ");
//	    }
//	}
	
	
}
