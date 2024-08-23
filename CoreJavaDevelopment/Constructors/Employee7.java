package com.Evergent.CoreJava.Constructors;
class Car{
	String color;
	int maxSpeed;
	Car(){
		color="White";
		maxSpeed=120;
	}
	Car(String color, int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void display() {
		System.out.println("color:"+color);
		System.out.println("maxSpeed:"+maxSpeed);
	}
}
public class Employee7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		Car car2=new Car("Red", 150);
		car1.display();
		car2.display();
	}

}
