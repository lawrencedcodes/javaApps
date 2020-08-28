package bankaccountapp;

public class Savings extends Account {
    //List properties specific to savings account
    //   "1" as first character, others
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;
    //List methods specific to savings account

    //Call constructor to initialize checking savings properties
    public Savings(String name, String social, double initDeposit) {
        super(name, social, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random()*Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your savings account features" +
                "\n Safety Deposit Box ID: " + safetyDepositBoxId +
                "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
