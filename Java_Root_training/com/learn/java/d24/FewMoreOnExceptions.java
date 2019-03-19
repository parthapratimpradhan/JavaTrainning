package com.learn.java.d24;

import java.io.IOException;

public class FewMoreOnExceptions {
	
	
	public int testChainException(int p) throws IOException{
		int res = 0;
		
		try {
			res = 10/p;
		} catch (ArithmeticException e) {
			if(p==0) {
				IOException e2 = new IOException("Input invalid",e);
				//e2.initCause(e);
				throw e2;
				
				//e.initCause(new IOException("Input invalid"));
				//e.initCause(new IOException("Input invalid as zero")); //Can't overwrite cause 
				//throw e;
			}
		}
		  
		  
		  return res;
		
	}

}
