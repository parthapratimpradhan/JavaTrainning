package com.learn.java;

public class Day9 {
	
	public int ki;
	
	public static final int FVA =300;
	
	public Day9(){
		//FVAR = 12;
	//	System.out.println("Constructor called");
	}
	
	public String javaLoops() {
		
		int x =100;
		int y = 200;
		
		while(++x<--y);
		
		System.out.println("mid point is  : "+x);
		int a, b;
		int i = 1;
		for(a=10, b=20 ;a<b ; a++, b--) {
			i++;
			//System.out.println("loop i = "+a);
			if(i%2==0) {
			//	break;
			}
			int vv[] = {0,1};
			//return vv;
		}
			
			int intarr[] = {1,2,3,4,5};
			
			//intarr
			
			int v1 = intarr[1];
			System.out.println("v1 = "+v1);
			
			v1 = 10;
			
			//System.out.println("intarr 1 = "+x[1]);
			System.out.println("intarr v1  = "+v1);
			
			
			for(int z : intarr) {
			//	z = 5;
				intarr[3]=100;
				System.out.println(z);
				
			}
			
			//Why we cant declear initialiser out side foreach?
			
			int xr[][] = new int[5][4];
			
			
			for(var xri:xr) {
				
				for(var xrj : xri) {
					
				}
				
			}
			
				
			
		//System.out.println("i ="+i);
		
		
		var abc = "10.0";
		
		for(var s = 2.5; s< 100; s *=2) {
			
			//var xvar = s/2;
			
			//System.out.println("xvar = "+xvar);
			
			System.out.println("s ="+s);
			
		}
		

		for(int c = 1; c<15;c++) {
			if(c==10)break;
			System.out.println("c "+c);
			
		}	
		
		System.out.println("------------------");
		
		first : for(int c = 1; c<15;c++) {
			if(c==10)continue;
			System.out.println("c "+c);
			for(int d = 101; d<115;d++) {
				if(d==110)
					break first;
				System.out.println("d "+d);
				
			}
			
		}
		
		
		boolean bol = true;
		if(bol)
		return "Hello";
		
		System.out.println("This is after return");
		
		Math.abs(2.9);
		return abc;
		
	}
	
	
}
