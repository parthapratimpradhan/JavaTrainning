package com.learn.java.d29.enumexp;

public class D29Main {
	
	public static void main(String[] args) {
		
		Day x = Day.MONDAY;
		
		Day y = Day.MONDAY;
		//Day d = new Day();
		
		if(x==y) {
			System.out.println("X and Y are equal");
		}
		
		
		System.out.println(" same oridanal value"+x.compareTo(y));
		
		System.out.println(" before oridanal value"+Day.THURSDAY.compareTo(y));
		
		
		System.out.println(" After oridanal value"+x.compareTo(Day.THURSDAY));
		
		
		switch(x){
		case FRIDAY:
			System.out.println(x);
			System.out.println();
			break;
		case SATURDAY:
			System.out.println(x);
			System.out.println();
			break;
		default :
			System.out.println("No case matched");
		}
		
		
//		for(Day day : Day.values()) {
//			System.out.println(day.toString());
//		}
//		
//		
//		Day d3 = Day.valueOf("WEDNESDAY");
//		System.out.println("X day : "+d3);
		
		System.out.println(Grade.valueOf(89));
		
		System.out.println(Grade.valueOf("O"));
		
		
		System.out.println(Day.MONDAY.getStringValue());
		
		System.out.println("MONDAY ordinal"+Day.MONDAY.ordinal());
		System.out.println("Friday ordinal"+Day.FRIDAY.ordinal());
		System.out.println(Grade.Pointer.TEN);
		
	}
}
