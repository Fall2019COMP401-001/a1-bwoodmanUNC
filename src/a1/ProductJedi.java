package a1;

public class ProductJedi {
	private String name;
	private double price;
	private int customers;
	private int quantity;
	
	public ProductJedi(String name, double price) {
		this.name = name;
		this.price = price;
		this.customers = 0;
		this.quantity = 0;
	}
	
	public int getTotalCustomers() {
		return customers;
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
	
	public void updateTotalCustomers(int customers) {
		this.customers += customers;
	}
}
