package com.learn.test.java;

public class TestMainClass {

	public static void main(String[] args) {
		
		
//		MyCalculator c = new MyCalculator();
//		
//		Thread th = new Thread(c,"My calculator thread");
//		th.start();
		
		MyThreadCalculator mtc = new MyThreadCalculator();
		//mtc.setName("My Thread Calculator");
		//mtc.start();
		
		Apple t = new Apple();
		t.print();
		
		Banana t2 = new Banana();
		t2.print();
		
		CountDownThread ct1 = new CountDownThread("Thread1");
		//ct1.t.setPriority(1);
		CountDownThread.start=10;
		//ct1.t.start();
		
		Thread th1 = new Thread(ct1,"same object th1");
		Thread th2 = new Thread(ct1,"same object th2");
		Thread th3 = new Thread(ct1,"same object th3");
		
		th1.start();
		//ct1.sleepTime=2000;
		th2.start();
	//	ct1.sleepTime=3000;
		th3.start();
		
		CountDownThread ct2 = new CountDownThread("Thread2");
		//ct1.t.setPriority(2);
		//CountDownThread.start=15;
		//ct2.t.start();
		
		CountDownThread ct3 = new CountDownThread("Thread3");
		//ct3.sleepTime = 1000;
		//ct1.t.setPriority(3);
		//CountDownThread.start=20;
		//ct3.t.start();
		
		
		
		
		countDown(5);
		
		//Thread.
		System.out.println("Thread one is alive : "+ct1.t.isAlive());
		System.out.println("Thread two is alive : "+ct2.t.isAlive());
		System.out.println("Thread three is alive : "+ct3.t.isAlive());
		
		
		try {
			ct1.t.join();
			ct2.t.join();
			ct3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Thread one is alive : "+ct1.t.isAlive());
		System.out.println("Thread two is alive : "+ct2.t.isAlive());
		System.out.println("Thread three is alive : "+ct3.t.isAlive());
		
		System.out.println("Main thread last line");
		
	//	LearnException l1 = new LearnException();
	//	l1.fiveBy(0);
		
	//	l1.fiveBy(2);
		
//		try {
//			System.out.println("devide by one :");
//			System.out.println("for 1 :"+l1.fiveBy(1));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			System.out.println();
//			System.out.println("devide by zero :");
//			System.out.println("for 0 :"+l1.fiveBy(0));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			int y = 10;
//			try {
//				y = y/0;
//			}catch(ArithmeticException e) {
//				throw new ArithmeticException();
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("Exception :"+e);
//			}catch(Exception e) {
//				System.out.println("Exception :"+e);
//			}
// 			l1.testMe();
// 			
//		}catch(Exception e) {
//			//System.out.println("y = "+y); // y do not have scope to catch block outside of try block it declared
//			System.out.println("Exception :"+e);
//		}
		
	//	System.out.println("After Method call");

	}
	
	private static void countDown(int start){
		for(int i = start; i>0; i--) {
			System.out.println(Thread.currentThread().getName()+"= i :"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

}
