package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private Integer gradeYear;
    private Integer studentId;
    private String courses;
    private Integer tuitionBalance;
    private Integer costOfCourse = 600;
    //Constructor prompt for student name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name ");
        this.lastName = in.nextLine();
        System.out.println("1-Freshman\n 2-Sophmore\n 3-Junior\n 4-Senior\n Enter student class level ");
        this.gradeYear = in.nextInt();

        System.out.println(firstName+ " "+lastName+ " " +gradeYear);
    }
    //Generate an ID

    //Enroll in courses

    //View balance, pay tuition

    //Show status

}
