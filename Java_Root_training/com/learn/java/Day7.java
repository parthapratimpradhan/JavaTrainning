package com.learn.java;

public class Day7 {
	
	public void autoconversion() {
		
		byte b = 7;
		int x = b;
		double l  = x;
		
		System.out.println(" l is : "+l);
		
		
		int x3 = 100;
		
		byte b3 = (byte) x3;
		
		
		System.out.println("x3  : "+b3);
		
		
		x3 = 130;
		
		byte b4 = (byte) x3;
		System.out.println("b4  : "+b4);	
		
		
		double d2 = 214748365000000.98776;
		
		int x4 = (int)d2;
		
		System.out.println("x4 = "+x4);
		
		
		for(int b5 = 1; b5 < 300; b5++) {
			byte byteVal = (byte)b5;
			//System.out.println("byteVal : "+byteVal+" for "+"intvalue : "+b5);
			
		}
		
		
		byte b6 = 50;
		
		byte b8 = 2;
		
		byte b7 = (byte)(b6*b8);
		
		
		
		float f = 5.67f;
		byte b9 = 42;
		char c = 'a';
		short s = 1024;
		int I = 10000;
		double d = 1.1234;
		//double result = (f * b) + (i + c ) - (d * s);
		
		
		
		//Array
		
		String strAr[] = {"str1", "str2"};
		int intAr2[] = new int[3];
		
		int twod[][] = new int[4][];
		
		twod[0] = new int[1];
		
		twod[1]= new int[2];
		//twod[2]	
		//twod[3]	
		
		String stra[][] = {{"r1c1","r1c2"},{"r2c1","r2c2"}};
		
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				System.out.println(stra[i][j]);
				
			}
		}
		
		
		var x1 = "Rama";
		System.out.println("var : "+x1);
		
		int var = 1;
		
		var k = getIntArray();
		
		var ary = new int[5][];
		print3DArray(2,3,4);
	}
	
	
	private int[] getIntArray() {
		return new int[5];
	}
	
	
	public void print3DArray(int a, int b, int c) {
	      int arr[][][] = new int[a][b][c];
	      int i, j, k, num=1;
		  
	      for(i=0; i<a; i++){
	          for(j=0; j<b; j++){
	              for(k=0; k<c; k++){
	                  arr[i][j][k] = num;
	                  num++;
	              }
	          }
	      }
		  
	       for(i=0; i<a; i++){
	          for(j=0; j<b; j++){
	              for(k=0; k<c; k++){
	                  System.out.print("arr[" +i+ "][" +j+ "][" +k+ "] = " +arr[i][j][k]+ "\t");
	              }
	              System.out.println();
	          }
	          System.out.println();
	      }
	   }

	

}
