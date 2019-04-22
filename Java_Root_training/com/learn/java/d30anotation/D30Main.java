package com.learn.java.d30anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class D30Main {

	public static void main(String[] args) {
		
		testAnno();
		
		
		D30Main d30 = new D30Main();
		Class<?> cl = d30.getClass();
		//what is cl here 
		
		Integer x = 12;
		Double f ;
		
		//x = f;
		
		//f = x;
		
		int i = 10;
		
		double d = i;
		
		
		System.out.println("MyAnno.class : "+MyAnno.class);
		
		System.out.println("D30Main.class : "+D30Main.class);
		
		try {
			
			//printAnotationValue(cl,"testAnno");
			
			//printAnotationValue(cl,"testAnnoMethod");
			
			printAnotationValue(cl,"testAddAndPrint");
			
			
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

	@MyAnno(str = "MyValue", val = 10)
	public static void testAnno() {
		// TODO Auto-generated method stub
		
	}
	
	
	@MyAnno(str = "MyValue", val = 10)
	public void testAnnoMethod() {
		System.out.println("testAnnoMethod");
	}
	
	@MyAnno(str = "MyValue", val = 5)
	public void testAddAndPrint(String sufix, int x, int y) {
		System.out.println("testAnnoMethod");
	}
	
	
	@What
	@MyAnno(str = "MyValue", val = 25)
	@SingleMEmberValue("Test")
	public void testAddAndPrint(int x, int y) {
		System.out.println("testAnnoMethod");
	}
	
	
	
	
	
	public static void printAnotationValue(Class<?> cl, String methodName) throws NoSuchMethodException, SecurityException {
		Method m = cl.getMethod(methodName, int.class, int.class);
//		MyAnno ant = m.getAnnotation(MyAnno.class);
//		System.out.println("Annotation str : "+ant.str());
//		System.out.println("Annotation val : "+ant.val());
		
		
		 Annotation ants[] = m.getAnnotations();
		 
		 for (Annotation ant : ants) {
			 
			 System.out.println(ant);
			 
		 }
	}

}
