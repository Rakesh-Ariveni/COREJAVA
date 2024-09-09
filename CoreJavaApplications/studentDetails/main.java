package com.Evergent.CoreJava.studentDetails;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int rollno=0;
		String name="";
		float marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Rollno");
		rollno=sin.nextInt();
		System.out.println(("Enter Name"));
		name = sin.next();
		System.out.println("Enter Marks");
		marks = sin.nextFloat();
		
		studentService StudentService = new studentService();
		
		int updeateCount=StudentService.addstudentService(rollno,name,marks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record rakesh Success");
		
		
		
		
	}

}