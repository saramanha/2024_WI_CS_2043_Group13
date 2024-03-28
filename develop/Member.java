package Team13Project.develop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Member extends Person {
	private static int numberHolder = 1000;
	private int memberNumber;
	private int memberLevel;
	private String dateJoined;

public Member (String firstNameIn, String lastNameIn, String addressIn, String phoneNumberIn,String emailIn, String dateJoinedIn) {
	super(firstNameIn, lastNameIn, addressIn, phoneNumberIn, emailIn);
	this.memberNumber = numberHolder;
	dateJoined = dateJoinedIn;
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
public String renewDate() {

    LocalDate joinDate = LocalDate.parse(dateJoined, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

    LocalDate dateOfRenewal = joinDate.plusMonths(6);

    DateTimeFormatter renewalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    return dateOfRenewal.format(renewalDate);
}

public String updateRenew(String datePaid) {
	LocalDate currentDate = LocalDate.parse(datePaid, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
	LocalDate newRenewalDate = currentDate.plusMonths(6);
	
	DateTimeFormatter nextRenewalDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	return newRenewalDate.format(nextRenewalDate);
}

}
