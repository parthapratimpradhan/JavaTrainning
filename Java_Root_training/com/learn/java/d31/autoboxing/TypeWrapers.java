package com.learn.java.d31.autoboxing;


public class TypeWrapers {

	public static void main(String[] args) {
		
		Character c =Character.valueOf('s');
		
		String s;
		
		s = c.toString();
		
		//s = c.charValue();
		
		
		
		System.out.println(c); 
		
		System.out.println(c.charValue()); 
		
		
		//
		//Boolean(boolean boolValue)
		//Boolean(String boolString)
		
		
		
		Boolean b = new Boolean(true);
		
		Boolean b2 = 
		Boolean.valueOf("true");
		
		
		Boolean b3 = 
				Boolean.valueOf(true);
				
		
		System.out.println(b2);
		
		
		Integer i =//Integer.valueOf(10001, 2);
		Integer.parseInt("10001", 2);
		//7 + 1*16 = 23
		
		
		System.out.println(i);
		System.out.println(i.doubleValue());
		
		
		System.out.println(i.floatValue());
		
		int j= 200;
		
		Integer i3 = j;
		
		Integer iOb = 100; // autobox an int
		
		
		int k = iOb; // auto-unbox
		
		Integer l2 = testBox(10);
		
		Integer l = testBox(j);
		
		
		l +=1 ;
		
		l = l2 *k;
		System.out.println(++l);
		
		
		Integer iob = 100;
		
		switch (iob) {
		case 1:
			
			break;

		default:
			break;
		}
		
		Character c3 = 'm';
		char k2 = c3;
		
		Boolean b4 = true;
		
		boolean b5 = b4;
		
		iOb = 500;
		
		int h = iOb.byteValue();
		
		System.out.println(h);
		
		// A bad use of autoboxing/unboxing!
		Double a, b9, c9;

		a = 10.0;
		b9 = 4.0;

		c9 = Math.sqrt(a*a + b9*b9);

		System.out.println("Hypotenuse is " + c);
		
		
		//Double d9 = 12;

	//	Boolean b = "true";

	}
	
	
	//@Override
	public static int testBox(Integer m) {
		
		
		return m;
	}

}
