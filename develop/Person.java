package Team13;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;
	
public Person (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn, String emailIn) {
	firstName = firstNameIn;
	lastName = lastNameIn;
	address = addressIn;
	phoneNumber = phoneNumberIn;
	email = emailIn;
}
public String getName() {
	return firstName + " " + lastName;
}
public String getAddress() {
	return address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public String toString() {
	return firstName + " " + lastName + ".\n" + address + " " + phoneNumber;
}

}
