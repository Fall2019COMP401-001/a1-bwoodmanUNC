package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		
		int totalItems = scan.nextInt();
		String[] items = new String[totalItems];
		double[] itemPrices = new double[totalItems];
		
		for(int i = 0; i < totalItems; i++) {
			items[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		for(int i = 0; i < totalItems; i++) {
			System.out.println(items[i] + " " + itemPrices[i]);
		}
		
		int totalCustomers = scan.nextInt();
		
		for (int i = 0; i < totalCustomers; i++) {
			
		}
		
		
		
	}
}
