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
<<<<<<< HEAD
		return "Social security #" +ssn;
=======
			return "Social security #" +ssn;
>>>>>>> 43f160d8e55926ef207e5d4e3269cef7d23dd05b
	}
}
					