package a1;

public class CustomerAdept {
	private String firstName;
	private String lastName;
	private double total;
	
	public CustomerAdept(String firstName, String lastName, double total) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.total = total;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void addTotal(double total) {
		this.total += total;
	}
}
