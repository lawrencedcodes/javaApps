package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "C:\\Users\\ldloc\\Documents\\Coding\\javaApps\\src\\bankaccountapp\\NewBankAccounts.csv";
        List<Account> accounts = new LinkedList<Account>();

        //Read CSV file
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder:newAccountHolders) {
            System.out.println("New Account");
            String name = accountHolder[0];
            String ssN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
           // System.out.println("Name: "+name+"ssn: "+ssN+"Account Type: "+accountType+" Initial Deposit: "+initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name,ssN,initDeposit));
            } else if (accountType.equals("Checking")){
                accounts.add(new Checking(name,ssN,initDeposit));
            } else {
                System.out.println("Error reading account type, please try again.");
            }
        }
        for (Account acc:accounts) {
            System.out.println("\n*********");
            acc.showInfo();
        }
        // todo Perform random transactions
        // todo i.e. accounts.get((int) Math.random() * accounts.size()).deposit(1000);
        // todo iterate through accounts, print balance, etc.
        // todo native gui, web gui, mobile gui
    }
}
