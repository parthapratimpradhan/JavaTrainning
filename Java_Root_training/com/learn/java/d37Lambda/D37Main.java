package com.learn.java.d37Lambda;

import com.learn.java.d36Lambda.MyNum;

public class D37Main {
	
	String str = "Rakesh";
	
	public static void main(String[] args) throws EmptyArrayException{
		
		MyNum myob1 = (i) -> 34.6;
		
		
		System.out.println(myob1.myMeth(10));
		
		int k =100;
		
		
		NumericFunc factorialCalculat = (i) -> {
			double fact = 1.0;
			if(i<1) {
				return 0.0;
			}
			for(int j =1; j<=i; j++) {
				fact*=j;
			}
			//k +=100;
			return fact+k;
		};
		
	//	k =k +100;
		System.out.println("K ="+k);
		
		
		
		GenFunc<Double> numFun1 = (i) -> {
			double fact = 1.0;
			if(i<1) {
				return 0.0;
			}
			for(int j =1; j<=i; j++) {
				fact*=j;
			}
			return fact;
		};
		
		
		System.out.println("factorial = "+factorialCalculat.func(5.0));
		
		Integer x = 1;
		
		Test t1 = (j) -> {j=j+100;};
		
		
		t1.test(x);
		
		
		System.out.println(x);
	
		
		StringFunc strRevers = (str) -> {
			
			String[] strar = str.split("");
			
			if(strar.length==0) {
				//throw new ArrayIndexOutOfBoundsException();
				throw new EmptyArrayException();
			}
			
			String reversString = "";
			
			for(String st : strar) {
				reversString = st + reversString;
			}
			
			return reversString;
			
		};
		
		GenFunc<String> strRevFun = (str) -> {
			
			String[] strar = str.split("");
			
			if(strar.length==0) {
				//throw new ArrayIndexOutOfBoundsException();
				throw new EmptyArrayException();
			}
			
			String reversString = "";
			
			for(String st : strar) {
				reversString = st + reversString;
			}
			
			return reversString;
			
		};
		
		System.out.println("Reversed string = "+strRevers.func("Mihir"));
		System.out.println("Reversed string = "+stringOp(strRevers,"Mihir"));
		
		
		D37Main d12 = new D37Main();
		d12.testMe();
	}
	
	
	public void testMe() throws EmptyArrayException {
		StringFunc strRevers = (str) -> {
					
					String[] strar = this.str.split("");
					
					if(strar.length==0) {
						//throw new ArrayIndexOutOfBoundsException();
						throw new EmptyArrayException();
					}
					
					String reversString = "";
					
					for(String st : strar) {
						reversString = st + reversString;
					}
					
					return reversString;
					
				};
				TestLambdaFunc tfc = new TestLambdaFunc();
				
				System.out.println(tfc.testFunc(strRevers));
				
				
	}
	
	
	
	public static String stringOp(StringFunc sf, String str) throws EmptyArrayException {
		return sf.func(str);
	}

}
