package business;

public class Employee extends Person {
	String ssn;
	
	public Employee(String ssn) {
		super();
		this.ssn = ssn;
	}

	public Employee() {
		super();
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
			return "Social security #" +ssn;
	}
}
					