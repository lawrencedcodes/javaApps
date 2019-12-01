import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class WheelOfFortune {
    public static void main(String [] args) throws Exception {
        System.out.println("Welcome to Wheel of Fortune!");

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
        System.out.println(currentLine);
        for (int j=0; j<currentLine.length(); j++){
            System.out.printf("_");
        }
    }
}

