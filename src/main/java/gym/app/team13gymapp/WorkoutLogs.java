package Team13;

public class WorkoutLogs {
	private int logID;
	private int memberID;
	private String sessionDate;
	private String sessionDetails;
	private String sessionGoals;
	
public WorkoutLogs(int logIDIn, int memberIDIn, String sessionDateIn, String sessionDetailsIn, String sessionGoalsIn) {
	logID = logIDIn;
	memberID = memberIDIn;
	sessionDate = sessionDateIn;
	sessionDetails = sessionDetailsIn;
	sessionGoals = sessionGoalsIn;
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

}
