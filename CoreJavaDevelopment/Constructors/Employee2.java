package com.Evergent.CoreJava.Constructors;

	
public class Employee2 {
	int eno;
	String ename;
	double sal;		
	Employee2(){
		System.out.println("Default Constructors");
	}
	Employee2(int eno1, String ename1, double sal1){
		eno=eno1;
		ename=ename1;
		sal=sal1;
	}
	public void display() {
		System.out.println("Emp no:"+eno);
		System.out.println("Emp name:"+ename);
		System.out.println("Emp sal:"+sal);
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		new Employee2();
		Employee2 em2=new Employee2(123, "Raj", 55000);
		em2.display();

	}
}

