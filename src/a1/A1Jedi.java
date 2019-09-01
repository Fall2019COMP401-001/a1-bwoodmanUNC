package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int totalItems = scan.nextInt();
		ProductJedi[] items = new ProductJedi[totalItems];
		
		for(int i = 0; i < totalItems; i++) {
			items[i] = new ProductJedi(scan.next(), scan.nextDouble());
		}
		
		int totalCustomers = scan.nextInt();
		
		for (int i = 0; i < totalCustomers; i++) {
			scan.next();
			scan.next();
			int totalProducts = scan.nextInt();
			for (int j = 0; j < totalProducts; j++) {
				int quantity = scan.nextInt();
				String productName = scan.next();
				for (int f = 0; f < totalItems; f++) {
					if (productName.equals(items[f].getName())) {
						items[f].updateTotalCustomers(1);
						items[f].updateQuantity(quantity);
					}
						
				}
			}
		}
		
		for (int i = 0; i < totalItems; i++) {
			if (items[i].getTotalCustomers() != 0)
				System.out.println(items[i].getTotalCustomers() + " customers bought " + items[i].getQuantity() + " " + items[i].getName());
			else
				System.out.println("No customers bought " + items[i].getName());
		}
		
	}
}
