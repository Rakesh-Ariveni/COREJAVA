package com.Evergent.CoreJava.Static;

public class StaticDemo6 {
	static String ename = "Raju";
	int age=28;
	String address="Kompally";

	public void display() {
		ename="welcome";
		System.out.println("ename:"+ename);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo6 s6=new StaticDemo6();
		System.out.println(s6.ename);
		s6.display();
	}

}  