package bankaccountapp;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {
        String file = "C:\\Users\\ldloc\\Documents\\Coding\\javaApps\\src\\bankaccountapp\\NewBankAccounts.csv";
        //Read CSV file
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder:newAccountHolders) {
            System.out.println("New Account");
            String name = accountHolder[0];
            String ssN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println("Name: "+name+"ssn: "+ssN+"Account Type: "+accountType+" Initial Deposit: "+initDeposit);
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
