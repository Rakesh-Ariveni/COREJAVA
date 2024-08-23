package com.Evergent.CoreJava.JavaBeans;

public class EmployeeImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Ravi");
		emp.setSal(50000);
		System.out.println("eno:"+emp.getEno());
		System.out.println("ename:"+emp.getEname());
		System.out.println("sal:"+emp.getSal());
	}

}
