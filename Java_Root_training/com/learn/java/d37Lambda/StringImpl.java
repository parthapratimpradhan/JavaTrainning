package com.learn.java.d37Lambda;

public class StringImpl implements StringFunc{

	@Override
	public String func(String s) throws EmptyArrayException{
		if("".equals(s)) {
		throw new EmptyArrayException();
		}
		return s;
	}

}
	
	
