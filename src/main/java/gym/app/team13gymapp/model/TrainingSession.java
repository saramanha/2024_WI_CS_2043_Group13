package gym.app.team13gymapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class represents booking a session at a gym.
 * @author Ben Macgillivray - 3735161.
 */

@Entity
public class TrainingSession {

    /**
     * The ID number for a session.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sessionID;

    private long personId;

    /**
     * The type of session.
     */
    private String sessionType;

    /**
     * The date and time of a session.
     */
    private String sessionTime;

    private double cost;

    public TrainingSession(){

    }
    /**
     * This method constructs a session containing the ID, type, and time of a session.
     * @param personId The ID number of the member booking a session.
     * @param typeIn The type of session.
     * @param timeIn The time of a session.
     */
    public TrainingSession(long personId, String typeIn, String timeIn, int cost) {
        this.personId = personId;
        sessionType = typeIn;
        sessionTime = timeIn;
        this.cost = cost;
    }
    public String toString() {
        return "Session Info:" + "\n Type: " + sessionType + " For member " + personId + "\n Time: " + sessionTime + "\n Cost: " + getCost();
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
     * This method retrieves all the information about a session.
     * @return The information about a session.
     */
    public String getSessionInfo() {
        return "Session Information: \n  Session ID: " + sessionID +
                "\n  Session Type: " + sessionType + "\n  Session Time: " + sessionTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Long getPersonId(){
        return personId;
    }
    public void setPersonId(Long personIdIn){
        personId = personIdIn;
    }

}
