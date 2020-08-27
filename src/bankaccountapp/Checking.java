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
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                " Your checking account features:" +
                "\n Debit card number is: " + debitCardNumber +
                "\n Debit card pin is: " + debitCardPin
        );

    }

}
