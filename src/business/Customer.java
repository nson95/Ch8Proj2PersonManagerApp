package business;

public class Customer extends Person {
<<<<<<< HEAD
	private String first;
	private String last;
	private String number;

	public Customer(String first, String last, String number) {
		super();
		this.first = first;
		this.last = last;
		this.number = number;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
=======
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
>>>>>>> 43f160d8e55926ef207e5d4e3269cef7d23dd05b
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Customer [first=" + first + ", last=" + last + ", number=" + number + "]";
=======
		return "Name: " +firstname +" " +lastname +"\n"
				+"Customer number: " +customerNumber;
				
>>>>>>> 43f160d8e55926ef207e5d4e3269cef7d23dd05b
	}

}
