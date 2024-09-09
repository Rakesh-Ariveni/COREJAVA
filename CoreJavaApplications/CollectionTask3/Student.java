package com.Evergent.CoreJava.CollectionTask3;


public class Student {
    private String rollNumber;
    private String name;
    private String grade;

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return rollNumber != null && rollNumber.equals(student.rollNumber);
    }

    @Override
    public int hashCode() {
        return rollNumber != null ? rollNumber.hashCode() : 0;
    }
}
