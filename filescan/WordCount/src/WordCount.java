import java.util.Scanner;
import java.io.File;

public class WordCount {

    public static void main(String [] args) throws Exception{

        File file = new File("mobydick.txt");
        Scanner scannedFile = new Scanner(file);

        int words = 0;
        while (scannedFile.hasNextLine()) {
            String currentLine = scannedFile.nextLine();
            words += currentLine.split("").length;
        }
        System.out.println("Your file has a total of "+words+" words.");
    }


}