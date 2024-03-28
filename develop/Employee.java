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
public Transaction payment (int memberID, String date, double amount, String payMethod) {
	Transaction transaction = new Transaction(memberID, date, amount, payMethod);
	transaction.toString();
	return transaction;
}
public int checkMemberLevel(Member memberIn) {
	return memberIn.getMemberLevel();
}
public String memberRenewDate(Member memberInDate) {
	return memberInDate.renewDate();
}
public String updateMemRenewal(Member memberRenew, String currentDate) {
	return memberRenew.updateRenew(currentDate);
}
public void updateSession(SessionBooking id, String newType, String newTime) {
	id.setSessionType(newType);
	id.setSessionTime(newTime);
}
}
