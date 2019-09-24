package com.stackroute.main;

import java.util.Scanner;

public class StudentMarks {
    private int numOfStudents;
    private int[] stuGrades;

    public void setStuGrades() {
        System.out.println("Enter total number of students : ");
        Scanner scanner = new Scanner(System.in);
        numOfStudents = scanner.nextInt();
        stuGrades = new int[numOfStudents];
        System.out.println("Enter grades of students : ");
        int grade;
        try {
            for (int i = 0; i < numOfStudents; i++) {
                grade = scanner.nextInt();
                if(grade >= 0 && grade <= 100)
                    stuGrades[i] = grade;
                else
                    throw new Exception("Wrong grade is given as input");
            }
            System.out.println("All grades are saved successfully");
        } catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
