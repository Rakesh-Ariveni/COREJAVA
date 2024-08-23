package com.Evergent.CoreJava.Constructors;

	
public class Employee5 {
	int eno;
	String ename;
	double sal;		
	Employee5(){
		System.out.println("Default Constructors");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno, String ename, double sal){
		this(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Emp no:"+eno);
		System.out.println("Emp name:"+ename);
		System.out.println("Emp sal:"+sal);
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		new Employee5();
		Employee5 em2=new Employee5(123, "Raj", 55000);
		em2.display();

	}
}

