package bankaccountapp;

public class BankAccountApp {

    public static void main(String[] args) {
        //Read CSV file
        //Create new account based on CSV data
        Checking chkacct1 = new Checking("John Doe", "123456789",5000);

        Savings svacct1 = new Savings("Bota Rwanda", "987654321", 2000);
        //do stuff create account generate ID number
        //do other stuff
    }
}
