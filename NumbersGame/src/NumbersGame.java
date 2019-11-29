import java.util.Scanner;

public class NumbersGame {

    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean haswon = false;

        System.out.println("Hi! I've chosen a random number between 1 and 100");
        System.out.println("Try to guess it!");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have "+i+" guess(es) left. Choose again: ");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("You guessed a bit high. Try again: ");
            } else if (randomNumber > guess ) {
                System.out.println("You guessed a bit low. Try again: ");
            } else (randomNumber == guess) {
                haswon = true;
                break;
            }
        }
        if (haswon) {
            System.out.println("CORRECT! You WIN!");
        } else {
            System.out.println("Game over, you lose!");
            System.out.println("The correct number was "+randomNumber+".");
        }
    }

}
