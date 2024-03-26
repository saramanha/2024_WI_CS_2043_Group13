package Team13Project.develop;

public class Member extends Person {
	private static int numberHolder = 1000;
	private int memberNumber;
	private int memberLevel;

public Member (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn,String emailIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	this.memberNumber = numberHolder;
	numberHolder++;
}
public int getMemberID() {
	return memberNumber;
}
public int getMemberLevel() {
	return memberLevel;
}
public WorkoutLogs createLog(String sessionDate, String detailsIn, String goalsIn) {
	WorkoutLogs logentry = new WorkoutLogs (this.getMemberID(), sessionDate, detailsIn, goalsIn);
	logentry.toString();
	return logentry;
}

/**
Need to finish when appropriate class is complete.
public int checkRenewalDate() {
}

public String listTransactions() {
	return
	
*/

}
