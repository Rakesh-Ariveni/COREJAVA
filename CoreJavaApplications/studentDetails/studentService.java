package com.Evergent.CoreJava.studentDetails;


public class studentService {
    
public int addstudentService(int rollno,String name,float marks)
{  String grade="";

if(marks<=40)
{
grade = "C";
}
else if(marks<=75)
{
grade = "B";

}
else
{
grade = "A";
}


studentDAO StudentDAO = new studentDAO();
studentBean StudentBean=new studentBean();
StudentBean.setRollno(rollno);	
StudentBean.setName(name);
StudentBean.setMarks(marks);
StudentBean.setGrade(grade);

int updateResult= StudentDAO.addStudent(StudentBean);

return 1;
} 
}
