import java.util.Scanner;
import java.io.File;

public class WordCount {

    public static void main (String [] args) throws Exception {

        File file = new File("mobydick.txt");
        Scanner scannedFile = new Scanner(file);
        while (scannedFile.hasNextLine()) {
            String currentLine = scannedFile.nextLine();
            System.out.println(currentLine);
        }
     }


}