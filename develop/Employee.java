package Team13Project.develop;

public class Employee extends Person {
	private static int employeeID = 1000;
	
public Employee (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn,String emailIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	employeeID++;
}
public int getID() {
	return employeeID;
}
public SessionBooking createBooking (int id, String type, String time) {
	SessionBooking session = new SessionBooking (id, type, time);
	session.toString();
	return session;
}
/**


public Financial getRenewalDate() {
	return variable.getRenewDate();
}
public Financial updateRenewalDate(int newDate) {


*/
}
