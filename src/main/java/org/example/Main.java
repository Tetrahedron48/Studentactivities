package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
    public static void main(String[] args) throws Exception{
        int num = 0;
        System.out.println("How many students do you want to add: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter #" + (i + 1) + " student ID: ");
            String studentID = scanner.next();
            System.out.println("Enter #" + (i + 1) + " student name: ");
            String studentName = scanner.next();
            System.out.println("Enter number of extra activities: ");
            num = scanner.nextInt();
            String[] extraActivities = students[i].addExtraActivity(num);
            students[i] = new Student(studentID, studentName, extraActivities);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
            System.out.println(Arrays.toString(students[i].getExtraActivities()));
            System.out.println();
        }
    }
}
