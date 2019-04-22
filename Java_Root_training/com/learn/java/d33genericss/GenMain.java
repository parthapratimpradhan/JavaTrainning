package com.learn.java.d33genericss;

public class GenMain {

	public static void main(String[] args) {
		
		MyGen<String> ob1;
		
		ob1= new MyGen<String>("One");
		
		System.out.println("ob1.id : "+ob1.id);
		
		MyGen<Integer> iob;
		
		iob= new MyGen<Integer>(2);
		Integer x = iob.id;
		System.out.println("iob.id : "+x);
		
		//////
		
		Gen<String> g = new Gen<String>("TEN");
		
		String strData = g.getGenericData();
		
		
		System.out.println("Generic Data :"+strData);
		
		
		//g.printGenericData(strData);
		g.showType();
		
		
		
		
		Gen<Integer> g2 = new Gen<Integer>(10);
		
		int intData = g2.getGenericData();
		
		//g2 = new Gen<Double>(88.0); // Error!
		
		//	Gen<int> intOb = new Gen<int>(53); // Error, can't use primitive type
		
		//g2 =g;
		
		
		System.out.println("Generic Data :"+intData);
		//g2.printGenericData(intData);
		g2.showType();

		Gen<MyDataType> g3 = new Gen<MyDataType>(new MyDataType());
		
		
		//int z = ob1.id;
		
		
		 TwoGen<String,Integer> tg1;
		 
		 tg1 = new TwoGen<String,Integer>("Electrical",19);
		
		 System.out.println("tg1"+tg1);
		 
		 
		 TwoGen<Integer,Integer> tg2;
		 
		 tg2 = new TwoGen<Integer,Integer>(10,19);
		
		 System.out.println("tg2"+tg2);
		 
		 
		 
		 TwoGen<Integer,MyDataType> tg3;
		 
		 tg3 = new TwoGen<Integer,MyDataType>(10,new MyDataType());
		
		 System.out.println("tg3"+tg3);
		 
		 
		// TwoGen<String> tgs;
	}

}
