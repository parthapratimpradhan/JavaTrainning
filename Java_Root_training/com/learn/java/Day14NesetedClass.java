package com.learn.java;



public class Day14NesetedClass {
	
	private int x = 1;
	
	
	
	
	public void checkDay14() {
		Chield c1 = new Chield();
		
		c1.chieldMethod();
		
		
		String st1 = new String("abcd");
		String st2 = "abcd";
		
		if(st1==st2) {
			System.out.println("Same memory");
			
		}else {
			System.out.println("Different memory");
		}
		if(st1.equals(st2)) {
			System.out.println("Same Value");
			
		}else {
			System.out.println("Different Value");
		}
		
		for(int i =0; i <5; i++) {
			int s=i;
			
			class ChieldInLoop {
				
				//int y = i;
				void chieldMethod() {
					System.out.println("Valyue of y : "+s);
					//System.out.println("Valyue of y : "+i); // Why Local variable i defined in an enclosing scope must be final or effectively final
					//System.out.println("Valyue of x  : "+x);
				}
				
				
			}
			
			ChieldInLoop chn = new ChieldInLoop();
			chn.chieldMethod();
			
		}
		
		
		
		
	}
	
	
	public Chield getChieldObject() {
		Chield c1 = new Chield();
		
		
		
		return c1;
		
		
	}
	
	class Chield {
		
		int cx = 10;
		int x = 10;
		void chieldMethod() {
			int x = 100;
			
			System.out.println("Local x = "+x);
			
			System.out.println("This x = "+this.x);
			
			System.out.println("Parent class x ="+Day14NesetedClass.this.x);
			
			
			//System.out.println("Valyue of cx : "+cx);
			//System.out.println("Valyue of x  : "+this.x);//Day14NesetedClass.this
		}
		
		
	}
	

}
