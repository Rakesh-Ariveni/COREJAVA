package com.Evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo7throws1 {

	String name="null";
	int k=0;
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo7throws1 ed7=new ExceptionDemo7throws1();
			ed7.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}
	}

}