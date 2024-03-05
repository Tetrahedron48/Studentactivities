package org.example;

import java.util.Scanner;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    Scanner scanner = new Scanner(System.in);
    public String[] addExtraActivity(int num) {
        String[] extra = new String[num];
        for (int j = 0; j < num; j++) {
            System.out.println("Enter extra activity " + (j + 1) + ": ");
            extra[j] = scanner.next();
        }
        return extra;
    }

    public String toString() {
        return "Student ID: " + studentID + "\nStudent Name: " + studentName + "\nExtra Activities: " ;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getExtraActivities(int k) {
        String extraActivity = extraActivities[k];
        return extraActivity;
    }

    public Student(String studentID,String studentName,String[] extraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = extraActivities;

    }

    public Student() {
    }

}