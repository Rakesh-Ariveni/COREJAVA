package com.Evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo8throws2 {

	String name="null";
	int k=0;
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}
	public void myChange() throws NullPointerException{
		myData();
		System.out.println("change method");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo8throws2 ed8=new ExceptionDemo8throws2();
			ed8.myChange();
		}
		catch(Exception e) {
			System.out.println("I can handle:"+e);
		}
	}

}