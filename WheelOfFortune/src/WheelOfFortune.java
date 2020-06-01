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
        boolean winning = true;
        //System.out.println(lineNumber);
        String currentLine = gameFile.nextLine();
        System.out.println(currentLine);
        String guessBoard = "";
        for (int j=0; j<currentLine.length(); j++){
            guessBoard += "_";
        }
        System.out.println("This movie title has "+currentLine.length()+" total characters and spaces.");
        System.out.println(guessBoard);


        userInput:
            while (winning) {
                System.out.println("Type any letter for your guess!");
                Scanner scanner = new Scanner(System.in);
                String playerGuess = scanner.nextLine();
                char[] finalAnswer = currentLine.toCharArray();
                char[] guessArray = guessBoard.toCharArray();
                char guessChar = playerGuess.charAt(0);
                continueInput:
                    for (int k = 0; k <= finalAnswer.length; k++) {
                        if ((finalAnswer[k]) == guessChar) {
                            guessArray[k] = guessChar;
                            System.out.println(guessArray);
                            System.out.println("Type any letter for your guess!");
                            scanner = new Scanner(System.in);
                            playerGuess = scanner.nextLine();
                            guessChar = playerGuess.charAt(0);
                            continue continueInput;
                        }
                    }
            }
    }
}

