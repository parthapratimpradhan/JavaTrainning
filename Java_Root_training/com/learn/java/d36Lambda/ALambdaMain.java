package com.learn.java.d36Lambda;

public class ALambdaMain {

	public static void main(String[] args) {
		double res;
		int i =10;
		int k =10;
		
		//functional interface
		MyNum mynum1;
		mynum1 = (j) ->  12.3*i*j+k;
		res = mynum1.myMeth(i);
		System.out.println("Lambda result = "+res);

		
		
		MyNum myNum2;
		myNum2 = new WithoutLambda();
		res = myNum2.myMeth(i);
		System.out.println("Without Lambda result = "+res);
		
		
		WithoutLambda wl;
		//res = wl.myMeth(i);
		
		//() -> 123.45
		
//		double myMeth() { 
//			return 123.45; 
//			}
		
		
		MyNum mynum3;
	//	mynum3 = (str) ->  "Mihir"; //Error, does not match with return type of functional interface
		
		//n -> (n % 2)==0; // return type is boolen
		
		
		NumericTest factCheck = (m,n) -> (m%n)==0;
		
		System.out.println("factCheck 10, 2"+factCheck.test(10, 2));
		
		System.out.println("factCheck 10, 3"+factCheck.test(10, 3));
		
		
		NumericTest equalCheck = (m,n) -> m==n;
		
		System.out.println("equalCheck 10, 3"+equalCheck.test(10, 3));
		
		
		NumericTest greaterCheck = (m,n) -> m>n;
		
		
	}

}
