package com.learn.java.d38LambdaMethod;

public class ALamdaTestMain {

	public static void main(String[] args) {
		
		//FunIntRevFun fiob1   =  LambdaMethod::reversFunc;
		LambdaMethod lmob1 = new LambdaMethod();
		FunIntRevFun fiob1   =  lmob1::reversFunc;
		
		System.out.println("Reverse of Tricon : "+fiob1.reversFunc("Tricon"));

		
		
		FunIntRevFun fiob2   =  lmob1::reversFunc;
		
		
		

        IntNumChecker checker1 = new IntNumChecker(10);
        
        int numToCompare = 9;
        
        
        IntNumPredicate<IntNumChecker> p = IntNumChecker::isBigger;
        
        
       // WithoutMRef mob1 = IntNumChecker::isBigger;
        
        
        boolean result = p.check(checker1,9);
        if (result) {
            System.out.println(checker1.num + " is bigger than " + numToCompare);
        }else {
            System.out.println(checker1.num + " is smaller  " + numToCompare);
        }
        
        
        // second object of IntNumChecker
        IntNumChecker checker2 = new IntNumChecker(8);
        result = p.check(checker2,9);
        if (result) {
            System.out.println(checker2.num + " is bigger than " + numToCompare);
        }else {
            System.out.println(checker2.num + " is smaller " + numToCompare);
        }
    
		
	}

}
