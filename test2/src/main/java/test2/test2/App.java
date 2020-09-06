package test2.test2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	String yes = "yes";
    	String no = "no";
    	Beverage CocaCola = new Beverage("coke");
    	System.out.println("Time to order some");
    	Beverage.showBeverage();
        System.out.println("Ready to place an order? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        
        if (answer.contentEquals(yes)) {
        	Beverage.makeOrder();
        } else {
        	System.out.println("OK, maybe next time.");
        }
    }
}
