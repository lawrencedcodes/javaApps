package test2.test2;

import java.util.Scanner;

public class Beverage {
	private static int gallons;
	private static int diff;
	private static int order;
	static String flavor;
	boolean adequate;
	
	public Beverage(String flavor) {
		this.flavor=flavor;
	}
	
	public Beverage(int gallons, boolean adequate) {
		this.gallons = gallons;
		this.adequate = adequate;
	}
	
	public static void showBeverage() {
		System.out.println("Current beverage is "+flavor);
		
	}
	public static void makeOrder() {
		System.out.println("How many gallons do you have? \n");
		Scanner in = new Scanner(System.in);
		int gallons = in.nextInt();
		if (gallons<15) {
			diff = 15-gallons;
			order = diff%5;
			System.out.println("Order "+order+" cases.");
		}
	}
}
