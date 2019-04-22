package com.learn.java.d35genericss;

public interface MinMax<T extends Comparable<T>> {
	
	T findMin(T[] ob);
	
	T findMax(T[] ob);

}
