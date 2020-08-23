package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate {
    //List common properties for checking and savings
    String name;
    String social;
    double balance;
    static int index = 1000;
    String accountNumber;
    double rate;

    //List common methods for checking and savings
    //Constructor to set base properties and initialize acct
    public Account(String name, String social, double initDeposit) {
        this.name = name;
        this.social = social;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwo = social.substring(social.length() - 2, social.length());
        int uniqueId = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwo + uniqueId + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER:"  + accountNumber +
                "\nBALANCE: " + balance
        );
    }
}
