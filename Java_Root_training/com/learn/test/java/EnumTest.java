package com.learn.test.java;

public class EnumTest {
	
	
	public static void main(String[] args) {
		DAY d = DAY.FRIDAY;
		int i = 0;
		switch(i){
		case 0:
			System.out.println(0);
			System.out.println();
		case 1:
			System.out.println(0);
			System.out.println();
		default :
			System.out.println("No case matched");
		}
		
		switch(d){
		case FRIDAY:
			System.out.println(d);
			System.out.println();
		case SATURDAY:
			System.out.println(d);
			System.out.println();
		default :
			System.out.println("No case matched");
		}
		
		for(DAY day : DAY.values()) {
			System.out.println(day.toString());
		}
		
		DAY x = DAY.valueOf("WEDNESDAY");
		System.out.println("X day : "+x);
		
		
		
		
		//Character c = new Character('s');
		Character c = Character.valueOf('s');
		
		//What is the difference between only c and c.charValue() inside print statement?
		System.out.println(c); // c.toString() returns a string
		System.out.println(c.charValue()); //  c.charValue() returns a char value.
		
		Integer iOa = Integer.valueOf(100);
		Integer iOb = Integer.valueOf("12345", 10);
		
		System.out.println(iOb.floatValue());
		
	}

}
