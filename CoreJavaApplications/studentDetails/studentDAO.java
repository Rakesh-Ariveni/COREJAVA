package com.Evergent.CoreJava.studentDetails;

import java.util.ArrayList;

public class studentDAO {
	
	                      
	public int addStudent(studentBean StudentBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(StudentBean.getRollno());
			bookList.add(StudentBean.getName());
			bookList.add(StudentBean.getMarks());
			bookList.add(StudentBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("Student Rollno :"+StudentBean.getRollno());
			System.out.println("Student name :"+StudentBean.getName());
			System.out.println("Student Price :"+StudentBean.getMarks());
			System.out.println("Student Grade :"+StudentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
