package com.Evergent.CoreJava.OOPs;

public class PersonDetails {
	
	String name="Rakesh";
	int age=22;
	String address="Kompally";
	
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:"+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails p=new PersonDetails();
		p.display();

	}

}
