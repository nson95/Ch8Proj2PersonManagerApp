package business;

public class Person {
	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Person() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Name: " +firstname +" " +lastname;
	}
	
	

}
