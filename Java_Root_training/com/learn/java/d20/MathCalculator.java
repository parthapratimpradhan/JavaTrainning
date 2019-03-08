package com.learn.java.d20;

public class MathCalculator implements BasicCalculator {

	@Override
	public double add(double p1, double p2) {
		return p1+p2;
	}

	@Override
	public double substract(double p1, double p2) {
		return p1-p2;
	}

	@Override
	public double multiply(double p1, double p2) {
		return p1*p2;
	}

	@Override
	public double divison(double p1, double p2) {
		if(p2!=0)
		return p1/p2;
		else
		return 0;
	}

}
