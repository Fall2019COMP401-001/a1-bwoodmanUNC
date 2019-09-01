package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		// initial number of customers
		int totalCustomers = scan.nextInt();

		// Found solution to showing '12.50' rather than '12.5' here:
		// https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
		DecimalFormat dFormat = new DecimalFormat("#0.00");

		String[] firstNames = new String[totalCustomers];
		String[] lastNames = new String[totalCustomers];
		double[] totalPrices = new double[totalCustomers];

		for (int i = 0; i < totalCustomers; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int totalItems = scan.nextInt();
			int[] itemQuantities = new int[totalItems];
			double[] itemPrice = new double[totalItems];

			for (int j = 0; j < totalItems; j++) {
				itemQuantities[j] = scan.nextInt();
				scan.next();
				itemPrice[j] = scan.nextDouble();
			}
			for (int j = 0; j < totalItems; j++) {
				totalPrices[i] += itemQuantities[j] * itemPrice[j];
			}


		}
		
		for (int i = 0; i < totalCustomers; i++) {
			System.out.println(firstNames[i].substring(0, 1) + ". " + lastNames[i] + ": " + dFormat.format(totalPrices[i]));
		}
	}
}
