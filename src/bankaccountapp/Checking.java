package bankaccountapp;

public class Checking extends Account {
    //List properties specific to checking account
    //   debit card, pin, "2" as first character
    int debitCardNumber;
    int debitCardPin;
    //List methods specific to checking account

    //Call constructor to initialize checking account properties
    public Checking(String name, String social, double initDeposit) {
        super(name, social, initDeposit);
        accountNumber = "2" + accountNumber;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking Account");
    }

}
