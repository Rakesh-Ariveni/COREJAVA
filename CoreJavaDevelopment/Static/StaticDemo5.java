package com.Evergent.CoreJava.Static;

public class StaticDemo5 {
	static {
		System.out.println("Static block");
	}
	static String ename = "India";

	static public void myData() {
		System.out.println("myData");
	}

	public void myShow() {
		myData();
		System.out.println("myShow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ename);
		myData();
		StaticDemo5 s4 = new StaticDemo5();
		s4.myShow();
	}

}