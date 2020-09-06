package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate {
    //List common properties for checking and savings
    private String name;
    private String social;
    private double balance;

    private static int index = 1000;
    protected String accountNumber;
    protected double rate;

    //List common methods for checking and savings
    //Constructor to set base properties and initialize acct
    public Account(String name, String social, double initDeposit) {
        this.name = name;
        this.social = social;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwo = social.substring(social.length() - 2, social.length());
        int uniqueId = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwo + uniqueId + randomNumber;
    }
    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest is: $" + accruedInterest);
        printBalance();
    }
    //Common Methods
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing: "+ amount);
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing " + amount);
        printBalance();
    }
    public void transfer(String destination, double amount) {
        balance = balance - amount;
        System.out.println("Transferring "+ amount + " to "+ destination);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Your balance is now: " + balance);
    }
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER:"  + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
        );
    }
}
