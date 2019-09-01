package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Found solution to showing '12.50' rather than '12.5' here:
		// https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
		DecimalFormat dFormat = new DecimalFormat("#0.00");
		
		// Your code follows here.
		
		int totalItems = scan.nextInt();
		ProductAdept[] items = new ProductAdept[totalItems];
		
		for(int i = 0; i < totalItems; i++) {
			items[i] = new ProductAdept(scan.next(), scan.nextDouble());
		}
		
		int totalCustomers = scan.nextInt();
		
		CustomerAdept[] customers = new CustomerAdept[totalCustomers];
		for (int i = 0; i < totalCustomers; i++) {
			customers[i] = new CustomerAdept(scan.next(), scan.next(), 0);
			int totalProducts = scan.nextInt();
			for (int j = 0; j < totalProducts; j++) {
				int quantity = scan.nextInt();
				String productName = scan.next();
				for (int f = 0; f < totalItems; f++) {
					if (productName.equals(items[f].getName())) {
						customers[i].addTotal(quantity * items[f].getPrice());
					}
						
				}
			}
		}
		
		int biggest = checkBiggest(customers);
		int smallest = checkSmallest(customers);
		double totalAmountSpent = 0;
		
		for (int i = 0; i < totalCustomers; i++)
			totalAmountSpent += customers[i].getTotal();
		double average = totalAmountSpent / totalCustomers;
		
		System.out.println("Biggest: " + customers[biggest].getFirstName() + " " + customers[biggest].getLastName() + " (" + dFormat.format(customers[biggest].getTotal()) + ")");
		System.out.println("Smallest: " + customers[smallest].getFirstName() + " " + customers[smallest].getLastName() + " (" + dFormat.format(customers[smallest].getTotal()) + ")");
		System.out.println("Average: " + dFormat.format(average));
		
	}
	
	public static int checkBiggest(CustomerAdept[] customers) {
		int indexOfLargest = 0;
		double currentLargest = customers[0].getTotal();
		for (int i = 0; i < customers.length; i++) {
			if (Double.compare(customers[i].getTotal(), currentLargest) > 0) {
				indexOfLargest = i;
				currentLargest = customers[i].getTotal();
			}	
		}
		
		return indexOfLargest;
	}
	
	public static int checkSmallest(CustomerAdept[] customers) {
		int indexOfSmallest = 0;
		double currentSmallest = customers[0].getTotal();
		for (int i = 0; i < customers.length; i++) {
			if (Double.compare(customers[i].getTotal(), currentSmallest) < 0) {
				indexOfSmallest = i;
				currentSmallest = customers[i].getTotal();
			}	
		}
		
		return indexOfSmallest;
	}
	
}
