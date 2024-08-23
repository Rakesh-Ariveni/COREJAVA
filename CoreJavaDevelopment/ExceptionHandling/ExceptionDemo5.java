package com.Evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo5 {

	String name="null";
	int k=1;
	public void myData(){
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		finally {
			System.out.println("finally block closed connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed4=new ExceptionDemo5();
		ed4.myData();
	}

}