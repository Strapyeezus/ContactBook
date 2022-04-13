
public class PersonalContact extends Person{
	
	// Variables
	private String birthDate;
	private String relation;
	private String homePhone;
	
	// Constructors
	public PersonalContact(String firstName, String lastName, String address, String phoneNumber, String birthDate, String relation, String homePhone) {
		super(firstName, lastName, address, phoneNumber);
		setBirthDate(birthDate);
		setRelation(relation);
		setHomePhone(homePhone);
		
	}
	
	// Getters and Setters
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	// To String method
	public String toString() {
		return " \nName: " + getFirstName() + " " + getLastName() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + "\n"
				+ "Birthdate: " + birthDate + "\nRelation: " + relation + "\nHomephone: " + homePhone + "\n";
	}
}
