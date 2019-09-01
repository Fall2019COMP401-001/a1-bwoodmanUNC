package a1;
import java.util.List;
import java.util.ArrayList;

public class ProductJedi {
	private String name;
	private double price;
	private int quantity;
	private List<String> customers;
	
	public ProductJedi(String name, double price) {
		this.name = name;
		this.price = price;
		this.customers = new ArrayList<String>();
		this.quantity = 0;
	}
	
	public int getTotalCustomers() {
		return customers.size();
	}

	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void updateQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void updateTotalCustomers(String customerName) {
		if (!customers.contains(customerName))
			this.customers.add(customerName);
	}
}
