package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        //Query for number of students to add, initialize array
        System.out.println("Enter the number of students to add during this session: ");
        Scanner in = new Scanner(System.in);
        Integer numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create array based on num of students to add
        for (int i=0; i<numOfStudents; i++) {
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
}
