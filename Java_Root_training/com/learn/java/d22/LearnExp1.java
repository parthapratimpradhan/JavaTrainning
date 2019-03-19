package com.learn.java.d22;

public class LearnExp1 {
	
	public void testMe(int i) throws ClassNotFoundException {
		System.out.println();
		System.out.println("testMe start:");
		int x=0;
		int y=5;
		int z=0;
		int[] ar = new int[4];
		System.out.println("before try block");
			
		try {
			System.out.println("Start try");
			//int i = 2;
			z = 5/2;
			if(i>4) {
				//throw new ArrayIndexOutOfBoundsException("index : "+i+" is not in range.");
				throw new ClassNotFoundException();
			}else {
				ar[i] = z;
			}
			
			System.out.println("End try");
		} catch (ArithmeticException e) {
			System.out.println("Start catch ArithmeticException");
			System.out.println("Exception :"+e);
			z = 0;
			ar[0] =z;
			
			System.out.println("End catch");
		} 
		System.out.println("z : "+z);
		
	}

}

// try

// catch

// throw

// throws

// finally

