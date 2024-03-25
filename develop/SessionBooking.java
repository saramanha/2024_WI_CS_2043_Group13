package Team13;

/**
 * This class represents booking a session at a gym.
 * @author Ben Macgillivray - 3735161.
 */

public class SessionBooking {

    /**
     * The ID number for a session.
     */
    private int sessionID;

    /**
     * The ID number for the member booking a session.
     */
    private int memberID;

    /**
     * The type of session.
     */
    private String sessionType;

    /**
     * The date and time of a session.
     */
    private String sessionTime;

    /**
     * The starting point for session ID's.
     */
    private static int assignedID = 100;

    /**
     * This method constructs a session containing the ID, type, and time of a session.
     * @param idIn The ID number of a session.
     * @param memberIn The ID number of the member booking a session.
     * @param typeIn The type of session.
     * @param timeIn The time of a session. 
     */
    public SessionBooking(String typeIn, String timeIn) {
        sessionID = assignedID;
        sessionType = typeIn;
        sessionTime = timeIn;
        assignedID++;
    }

    /**
     * This method retrieves the ID number of a session.
     * @return The session ID.
     */
    public int getSessionID() {
        return sessionID;
    }

    /**
     * This method retrieves the type of session.
     * @return The type of the session.
     */
    public String getSessionType() {
        return sessionType;
    }

    /**
     * This method retrieves the time of a session.
     * @return The time of the session.
     */
    public String getSessionTime() {
        return sessionTime;
    }

    /**
     * This method updates the type of a session.
     * @param updatedType The updated type of a session.
     */
    public void setSessionType(String updatedType) {
        sessionType = updatedType;
    }

    /**
     * This method updates the time of a session.
     * @param updatedTime The updated time of a session.
     */
    public void setSessionTime(String updatedTime) {
        sessionTime = updatedTime;
    }

    /**
     * This method retrieves the cost of a session, which is dependent on the type of session.
     * @return The cost of a session.
     */
    public double getSessionCost() {
        double cost = 50.0;
        if(sessionType.toLowerCase().equals("private")) {
            cost = 65.0;
            return cost;
        }
        else {
            return cost;
        }
    }

    /**
     * This method retrieves all the information about a session.
     * @return The information about a session.
     */
    public String getSessionInfo() {
        return "Session Information: \n  Session ID: " + sessionID + 
                "\n  Session Type: " + sessionType + "\n  Session Time: " + sessionTime;
    }

}
