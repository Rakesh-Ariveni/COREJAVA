package com.Evergent.CoreJava.Constructors;

	
public class Employee3 {
	int eno;
	String ename;
	double sal;		
	Employee3(){
		System.out.println("Default Constructors");
	}
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
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
		new Employee3();
		Employee3 em2=new Employee3(123, "Raj", 55000);
		em2.display();

	}
}

