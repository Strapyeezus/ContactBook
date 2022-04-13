
public class BusinessContact extends Person{
	
	// Variables
	private String email;
	private String workPhone;
	
	// Constructors 
	public BusinessContact(String firstName, String lastName, String address, String phoneNumber, String email, String workPhone) {
		super(firstName, lastName, address, phoneNumber);
		setEmail(email);
		setWorkPhone(workPhone);
	}
	
	// Getters and Setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
	// To String Method
	@Override
	public String toString() {
		return " \nName: " + getFirstName() + " " + getLastName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\n"
				+ "Email: " + email + " \nWork Phone: " + workPhone + "\n"; 
	}

}
