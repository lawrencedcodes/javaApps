package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private Integer gradeYear;
    private String studentId;
    private String courses=null;
    private Integer tuitionBalance = 0;
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
    public void enroll() {
        //need a loop to be able to add multiple, then a break when done
        do {
            System.out.print("Enter a course to enroll or Q to quit: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 !=0);
        System.out.println("ENROLLED IN: "+courses);
        System.out.println("Tuition balance is: "+tuitionBalance);
    }
    //View balance, pay tuition
    public void viewBalance() {
        System.out.println("Your balance is: "+tuitionBalance);

    }
    public void payTuition(Integer payment) {
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: "+payment);
        viewBalance();
    }
    //Show status

}
