package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix=".company.com";
    private int defaultPasswordLength=10;
    private Integer emailCapacity = 500;

    //constructor to receive names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //call method asking for department , return it
        this.department = setDepartment();

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("The auto-generated password is "+this.password);

        String email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
    }


    //ask for dept
    private String setDepartment() {
        System.out.print("Enter the department\n1 for sales\n2 for IT and\n3 for Accounting.\nEnter 0 for none ");
        Scanner scan = new Scanner(System.in);
        Integer departmentChoice = scan.nextInt();
        if (departmentChoice==1) { return "Sales"; }
        else if (departmentChoice==2) {return "IT"; }
        else if (departmentChoice==3) {return "Accounting" ;}
        else {return "No department selected" ;}
    }


    //generate random psswwd
    private String randomPassword(Integer length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*().";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set email capacity
    public void setEmailCapacity(int capacity) {
        this.emailCapacity = capacity;
    }
    //set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    //change password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return emailCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo() {
        return  "\nDisplay name: " + firstName + " " + lastName +
                "\nCompany email: " + email +
                "\nMailbox Capacity: " + emailCapacity + "mb";
        }
}

