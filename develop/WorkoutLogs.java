package Team13Project.develop;

public class WorkoutLogs {
	private int logID = 00001;
	private int memberID;
	private String sessionDate;
	private String sessionDetails;
	private String sessionGoals;
	
public WorkoutLogs(int memberIDIn, String sessionDateIn, String sessionDetailsIn, String sessionGoalsIn) {
	memberID = memberIDIn;
	sessionDate = sessionDateIn;
	sessionDetails = sessionDetailsIn;
	sessionGoals = sessionGoalsIn;
	logID++;
}
public int getLog() {
	return logID;
}

public String getLogDate() {
	return sessionDate;
}
public String getLogDetails() {
	return sessionDetails;
}
public String getLogGoals() {
	return sessionGoals;
}
public String toString() {
	return "This session was done by " + memberID + "on " + sessionDate + sessionDetails + sessionGoals;
}

}
