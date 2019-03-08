package com.learn.java.d20;

public class TriconOfficeCalculator extends MathCalculator implements TaxCalculator{

	
	//us tax slab  0 to 10L = 0%, to 20L = 20%, 20L+ = 30%
	@Override
	public double calculateTax(double sal, double inv) {
		double tax =0;
		double taxIncom = sal-inv;
		if(taxIncom>1000000 && taxIncom<2000000){
			tax = (taxIncom-1000000)*0.10;
		}else if(taxIncom>2000000){
			tax = 1000000*0.20;
			tax += (taxIncom-1000000)*0.30;
		}
		
		return tax;
	}

}
