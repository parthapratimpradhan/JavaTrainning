package com.learn.java.d33genericss;

public class TwoGen<T,V> {
	
	T branch;
	V id;
	
	TwoGen(T b,V id){
		branch = b;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "TwoGen [branch=" + branch + ", id=" + id + "]";
	}
	

}
