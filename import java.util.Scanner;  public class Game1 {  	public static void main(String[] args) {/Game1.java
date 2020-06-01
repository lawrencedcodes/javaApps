
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userChoice;
		Scanner user_in = new Scanner(System.in);
		System.out.println("Welcome to the Corn Fields. You see a vast cornfield before you "
				+ "with entrances to the left and right"+"\n"+"Type L and enter to enter from the left."
				+"\n"+"Type R and enter to enter from the right.");
		userChoice = user_in.nextLine();
		if (userChoice.equals("R")) {
			System.out.println("You have entered from the right. A scarecrow is ahead.");
		} else {
			if (userChoice.equals("L")) {
				System.out.println("You have entered from the left. Choose R or L again to proceed in.");
			} else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
