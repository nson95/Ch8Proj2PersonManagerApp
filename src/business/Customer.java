package business;

public class Customer extends Person {
	String customerNumber;

	
	public Customer(String firstname, String lastname, String customerNumber) {
		super(firstname, lastname);
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Name: " +firstname +" " +lastname +"\n"
				+"Customer number: " +customerNumber;
				
	}

}
