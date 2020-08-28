package bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "C:\\Users\\ldloc\\Documents\\Coding\\javaApps\\src\\bankaccountapp\\NewBankAccounts.csv";
        //Read CSV file
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder:newAccountHolders) {
            System.out.println("New Account");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }

        //Create new account based on CSV data
//        Checking chkacct1 = new Checking("John Doe", "123456789",5000);
//        Savings svacct1 = new Savings("Bota Rwanda", "987654321", 2000);
//        svacct1.compound();
//        svacct1.showInfo();
//        System.out.println("**************");
//        chkacct1.showInfo();

    }
}
