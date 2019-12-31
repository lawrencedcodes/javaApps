import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CurrencyFormatter {
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 double payment = scanner.nextDouble();
                 scanner.close();
                 
                 String usC = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
                 String inC = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		 String cnC = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		 String fnC = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		 System.out.println("US: "+usC);
		 System.out.println("India: "+inC);
	         System.out.println("China: "+cnC);
		 System.out.println("France: "+fnC);
		

	}

}


