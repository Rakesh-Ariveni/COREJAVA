package com.Evergent.CoreJava.CollectionTask3;


import java.util.HashSet;
import java.util.Set;

public class StudentImp implements StudentInterface {
    Set<Student> studentSet = new HashSet<>();

    @Override
    public String addStudent(Student s) {
        studentSet.add(s);
        return s.getRollNumber();
    }

    @Override
    public void searchByRollNumber(String rollNumber) {
        boolean found = false;
        for (Student student : studentSet) {
            if (student.getRollNumber().equals(rollNumber)) {
                System.out.println(student.getRollNumber() + " " + student.getName() + " " + student.getGrade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    @Override
    public void getAllStudents() {
        if (!studentSet.isEmpty()) {
            for (Student student : studentSet) {
                System.out.println(student.getRollNumber() + " " + student.getName() + " " + student.getGrade());
            }
        } else {
            System.out.println("No students are available.");
        }
    }
}
