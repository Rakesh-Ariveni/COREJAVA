package com.Evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo6 {

	String name="null";
	int k=0;
	public void myData(){
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}
		finally {
			System.out.println("finally block closed connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ed4=new ExceptionDemo6();
		ed4.myData();
	}

}