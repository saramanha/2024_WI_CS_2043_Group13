package Team13Project.develop;

public class Member extends Person {
	private static int MEMBERNUMBER = 1000;
	private int memberLevel;

public Member (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn,String emailIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	MEMBERNUMBER++;
}
public int getMemberID() {
	return MEMBERNUMBER;
}
public int getMemberLevel() {
	return memberLevel;
}
public WorkoutLogs createLog(String sessionDate, String detailsIn, String goalsIn) {
	//int memberHolder = this.getMemberID();
	WorkoutLogs logentry = new WorkoutLogs (this.getMemberID(), sessionDate, detailsIn, goalsIn);
	return logentry;
}

/**
Need to finish when appropriate class is complete.
public int checkRenewalDate() {
}

public void logWorkout()
create Log and put in memberLogArray

public String listTransactions() {
	return
	
public String checkDiet()

public String checkMeals()
*/

}
