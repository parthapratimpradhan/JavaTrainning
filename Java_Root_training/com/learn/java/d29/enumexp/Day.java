package com.learn.java.d29.enumexp;

public enum Day{
		
		MONDAY("Monday"),
	    TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	
	
	private String stringValue;
	
	Day(){
		System.out.println(this+" is created.");
	}
	
	Day(String value){
		this.stringValue = value;
	}

	public String getStringValue() {
		return stringValue;
	}

}
