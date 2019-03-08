package com.learn.java.d20;

public class MheOfficeCalculator extends MathCalculator implements TaxCalculator{

	
	//us tax slab 0 - 5l = 10%, 5 = 20L 20% 20L+ = 30%
	@Override
	public double calculateTax(double sal, double inv) {
		double tax;
		double taxIncom = sal-inv;
		if(taxIncom<500000) {
			tax = taxIncom*0.10;
		}else if(taxIncom<2000000){
			tax = 500000*0.10;
			tax += (taxIncom-500000)*0.20;
		}else{
			tax = 500000*0.10;
			tax += 1500000*0.20;
			tax += (taxIncom-2000000)*0.30;
		}
		
		return tax;
	}

}
