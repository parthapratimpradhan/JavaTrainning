package com.learn.java.d35genericss;
import static com.learn.java.d35genericss.GenericsMethod.isIn;

import com.learn.java.d33genericss.Gen;

public class D35Main {

	public static void main(String[] args) {
		
		String d;
		Integer[] intarr = {1,2,3,4,5};
		
		Double[] darr = {1d,2d,3d,4d,5d};
		
		Integer it = 90;
		
		//System.out.println("Is present : "+isIn(intarr,9));
		
		//System.out.println("Is present : "+isIn(darr,it));
		
		System.out.println("Is present : "+isIn(darr,78d));
		
		
//		if(isIn(intarr,"4")) {
//			GenericsMethod.isInThis("4",intarr);
//				System.out.println("Is Present");
//		}else {
//			System.out.println("Not present");
//		}
		
		//Gen raw = new Gen("Abcd");
		
//		Gen raw = new Gen(Double.valueOf(98.6));
//		raw.showType();
		
		Gen raw;
		
		Gen<String> strOb = new Gen<String>("Abcd");
		
		//strOb = raw ;
		//strOb.showType();
		raw = strOb;
		raw.showType();
		
		Gen2<Integer> num = new Gen2<Integer>(100);
		
		String x = "Mihir";
		
		if(x instanceof String) {
			System.out.println("Type of x is String");
		}
		
		if(num instanceof Gen2<?>) { //generic type information will be erased at runtime
			System.out.println("Type of num is Gen2");
		}
		
		Gen3<Integer> genInhe = new Gen3<Integer>();
		
		if(genInhe instanceof NonGen) { 
			System.out.println("Type of genInhe is Gen3");
		}
		
		
		NonGen ng = new NonGen();
		
		if(ng instanceof Gen3<?>) { 
			System.out.println("Type of ng is Gen3");
		}else {
			System.out.println("Type of ng is Gen3");
		}
		
		Object a = "123";
		
		if(a instanceof Integer) {
			System.out.println("Type of a is Integer");
		}else {
			System.out.println("Type of a is not Integer");
		}
		
		Gen3<Number> genob = new Gen3<Number>();
		
		Gen3<Integer> genIob = new Gen3<Integer>();
		
		//genIob = (Gen3<Integer>) genob;
		
		Gen3<Integer> genob2 =  (Gen3<Integer>)genIob;
		
		//genIob = genob;
		
		Gen3 genIob2 = new Gen3();
		
		var ob1 = new Gen<Integer>(12);
		
		
		MyClass minmax = new MyClass();
		
		
		MyClassGen<Integer> minmaxgen = new MyClassGen<>();
		
		MyGenAmbiguity<Integer,Integer> mbob = new MyGenAmbiguity<Integer,Integer>();
		
		//mbob.set(10);
		
		Gen<?> gens[] = new Gen<?>[10]; 
		
		MyClass mcarr[] = new MyClass[10];
		
		
		
		Gen<Integer> gen1 = new Gen<Integer>(10);
		Gen<Integer> gen2 = new Gen<Integer>(10);
		Gen<String> genStr1 = new Gen<String>("Abcd");
		
		gens[0]=gen1;
		
		gens[1]=gen2;
		
		gens[2]=genStr1;
		
		gens[2].showType();
		
		//Gen<Integer> gens2[] = new Gen<Integer>[10]; 
		//Why array wont allow fixed generic type?
 	}

}
