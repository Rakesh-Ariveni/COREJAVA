package com.Evergent.CoreJava.ImmutableString;

public final class PersonImmutable {
	private final String name;
	private final int age;
	
	public PersonImmutable(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method st
		PersonImmutable person=new PersonImmutable("Raju", 30);
		System.out.println("name:"+ person.myName());
		System.out.println("age:"+ person.myAge());
	}
	

}
