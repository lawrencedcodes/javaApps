package bankaccountapp;

public class Savings extends Account {
    //List properties specific to savings account
    //   "1" as first character, others
    int safetyDepositBoxId;
    int safetyDepositBoxKey;
    //List methods specific to savings account

    //Call constructor to initialize checking savings properties
    public Savings(String name, String social, double initDeposit) {
        super(name, social, initDeposit);
        accountNumber = "1" + accountNumber;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
