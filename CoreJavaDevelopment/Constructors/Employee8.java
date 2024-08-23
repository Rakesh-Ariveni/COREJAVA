package com.Evergent.CoreJava.Constructors;

class Animal{
	private String name;
	private int age;
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}
class Dog extends Animal{
	private String breed;
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed=breed;
	}
	public void display() {
		super.display();
		System.out.println("Breed:"+breed);
	}
}

public class Employee8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy", 5, "Golden Retreiver");
		dog.display();

	}

}
