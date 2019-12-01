import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class WheelOfFortune {
    public static void main(String [] args) throws Exception {
        System.out.println("Welcome to Wheel of Fortune!");
        System.out.println("***************************");
        System.out.println("******               ******");
        System.out.println("******   LET'S PLAY! ******");
        System.out.println("******               ******");
        System.out.println("***************************");
        File file = new File("movies.txt");
        Scanner gameFile = new Scanner(file);
        int lineNumber = (int)(Math.random()*25);
        int i = 0;
        while (i<lineNumber) {
            gameFile.nextLine();
            i++;
        }
        System.out.println(lineNumber);
        String currentLine = gameFile.nextLine();
        //System.out.println(currentLine);
        String guessBoard = "";
        for (int j=0; j<currentLine.length(); j++){
            guessBoard += "_";
        }
        System.out.println("This movie title has "+currentLine.length()+" total characters and spaces.");
        System.out.println(guessBoard);
        System.out.println("Type any letter for your first guess!");
        Scanner scanner = new Scanner(System.in);
        String playerGuess = scanner.nextLine();
        char[] finalAnswer = currentLine.toCharArray();
        if (currentLine.contains(playerGuess)) {
            System.out.println("Good guess! "+playerGuess+" is one of the letters.");
        } else {
            System.out.println("Nope, that's not in the movie title. Game over.");
        }
    }
}

