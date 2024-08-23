package com.Evergent.CoreJava.Static;

public class StaticDemo1 {
	static String ename="India";
	static public void myData() {
		System.out.println("myData");
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticDemo2.ename);
		StaticDemo1.myData();

	}

}
