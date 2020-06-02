package emailApp;

public class EmailApp {

        public static void main(String[] args) {
            Email email1 = new Email("Lawrence","Lockhart");
            email1.setAlternateEmail("bingomane@gmail.com");
            System.out.print("Alternate email in case of emergency is "+email1.getAlternateEmail());
        }
}
