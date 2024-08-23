package com.Evergent.CoreJava.Constructors;

 class Employee12 {
	int eno;
	public Employee12() {

	}
	public Employee12(int eno) {
		System.out.println("Employee no:"+eno);
	}
}
	
public class Employee6 extends Employee12
	{
		String ename;
		double sal;
		Employee6(){
			System.out.println("Default");
		}
		Employee6(int eno, String ename, double sal){
			super(eno);
			this.ename=ename;
			this.sal=sal;
		}
		
		public void display() {
			System.out.println("ename: "+ename);
			System.out.println("sal: "+sal);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee6 emp6=new Employee6(1,"rakesh",50000);
		emp6.display();
		
	}
	}