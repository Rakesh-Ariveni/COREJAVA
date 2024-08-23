package com.Evergent.CoreJava.ObjectClassMethods;

public class toString {
	String name;
	int age;
	public toString(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public void person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name:"+name+"Age:"+age	;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toString p=new toString("Bhanu", 25);
		System.out.println(p);

	}
}
