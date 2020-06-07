package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private Integer gradeYear;
    private String studentId;
    private String courses;
    private Integer tuitionBalance;
    private static Integer costOfCourse = 600;
    private static Integer id = 1001;

    //Constructor prompt for student name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name ");
        this.lastName = in.nextLine();

        System.out.println("1-Freshman\n 2-Sophmore\n 3-Junior\n 4-Senior\n Enter student class level ");
        this.gradeYear = in.nextInt();
        setStudentId();
        System.out.println(firstName+ " "+lastName+ " " +gradeYear+ " "+studentId);


    }
    //Generate an ID
    private void setStudentId() {
        //Grade Level + ID
        this.studentId = gradeYear + "" + id;
        id++;
    }

    //Enroll in courses

    //View balance, pay tuition

    //Show status

}
