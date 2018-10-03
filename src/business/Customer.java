package business;

public class Customer extends Person {
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
	}

	@Override
	public String toString() {
		return "Customer [first=" + first + ", last=" + last + ", number=" + number + "]";
	}

}
