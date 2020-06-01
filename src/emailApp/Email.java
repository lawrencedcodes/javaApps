package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private Integer emailCapacity;

    //constructor to receive names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created for "+this.firstName+" "+this.lastName);

        //call method asking for department , return it
        this.department = setDepartment();
        System.out.println("Department is "+this.department);

        //call a method that returns a random password
    }

    //ask for dept
    private String setDepartment() {
        System.out.print("Enter the department\n1 for sales\n2 for IT and\n3 for Accounting.\nEnter 0 for none");
        Scanner scan = new Scanner(System.in);
        Integer departmentChoice = scan.nextInt();
        if (departmentChoice==1) { return "Sales"; }
        else if (departmentChoice==2) {return "IT"; }
        else if (departmentChoice==3) {return "Accounting" ;}
        else {return "No department selected" ;}
    }


    //generate random psswwd
    private String randomPassword(Integer length) {
        
    }


    //set email capacity

    //set alternate email

    //change password

}
