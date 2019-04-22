package com.learn.test.java;

public enum DAY {
	
	
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
	
	
	private int dayIndex;
	
	DAY(){
		
	}
	
	DAY(int dayIndex){
		System.out.println(dayIndex);
		this.setDayIndex(dayIndex);
	}

	public int getDayIndex() {
		return dayIndex;
	}

	private void setDayIndex(int dayIndex) {
		this.dayIndex = dayIndex;
	}
	
	

}
