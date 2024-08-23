package com.Evergent.CoreJava.ExceptionHandling;

public class ExceptionDemo2 {

	String name="null";
	public void myData(){
		try {
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}

}