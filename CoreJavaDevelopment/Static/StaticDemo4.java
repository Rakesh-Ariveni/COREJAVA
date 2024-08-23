package com.Evergent.CoreJava.Static;

public class StaticDemo4 {
	static String ename="India";
	String name="Ravi";
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
		StaticDemo4 s4=new StaticDemo4();
		s4.myShow();
	}

}