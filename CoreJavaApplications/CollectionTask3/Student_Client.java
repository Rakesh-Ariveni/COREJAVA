package com.Evergent.CoreJava.CollectionTask3;

import java.util.Scanner;

public class Student_Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentInterface studentSystem = new StudentImp();
        while (true) {
            System.out.println("1. Add Student 2. Search by roll number 3. Display All 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the roll number");
                    String rollNumber = sc.next();
                    System.out.println("Enter the student name");
                    String name = sc.next();
                    System.out.println("Enter the grade");
                    String grade = sc.next();
                    Student s = new Student();
                    s.setRollNumber(rollNumber);
                    s.setName(name);
                    s.setGrade(grade);
                    String message = studentSystem.addStudent(s);
                    System.out.println("Added student with roll number: " + message);
                    break;
                case 2:
                    System.out.println("Enter the roll number");
                    String rollNo = sc.next();
                    studentSystem.searchByRollNumber(rollNo);
                    break;
                case 3:
                    studentSystem.getAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
