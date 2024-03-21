package Team13;

public class Employee extends Person {
	private static int employeeID = 1000;
	
public Employee (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn,String emailIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	employeeID++;
}
public int getID() {
	return employeeID;
}
/**
public MemberLevel updateLevel(int newLevel) {
	
}

public Financial getRenewalDate() {
	return variable.getRenewDate();
}
public Financial updateRenewalDate(int newDate) {

}
public BookSession bookSession() {
}
public BookSession updateSession() {
}
public Diet listDiets() {
}
public Meal listMeals() {
}
*/
}
