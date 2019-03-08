package com.learn.java;

public class CarCooling {
	
	private int ct;
	
	private String colorName;
	
	

	public int getCt() {
		return ct;
	}

	private void setCt(int ct) {
		
		if(ct<0) {
			ct = 0;
		}
		this.ct = ct;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	public void startBackCooling() {
		
		System.out.println("startBackCooling called...");
		setCt(10);
		
	}
	

}
