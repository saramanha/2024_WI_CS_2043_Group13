package Team13Project.develop;

/**
 * This class represents a meal.
 * @author Ben Macgillivray.
 */

public class Meal {

    /**
     * The number of a meal.
     */
    private int mealNumber;

    /**
     * The main food of a meal.
     */
    private String mainFood;

    /**
     * The first side food of a meal.
     */
    private String firstSide;

    /**
     * The second side food of a meal.
     */
    private String secondSide;

    /**
     * Any extra side foods of a meal.
     */
    private String extraSide;

    /**
     * The starting point for meal numbers.
     */
    private static int assignedMealNum = 1;

    /**
     * This method constructs a meal containing the main food of a meal, the first 
     * side of a meal, the second side of a meal, and any extra side foods of a meal.
     * @param mainIn The main food of a meal.
     * @param firstSideIn The first side food of a meal.
     * @param secondSideIn The second side food of a meal.
     * @param extraIn Any extra side food of a meal.
     */
    public Meal(String mainIn, String firstSideIn, String secondSideIn, String extraIn) {
        mealNumber = assignedMealNum;
        mainFood = mainIn;
        firstSide = firstSideIn;
        secondSide = secondSideIn;
        extraSide = extraIn;
        assignedMealNum++;
    }
    
    public String toString() {
    	return "The meal is meal option " + mealNumber + "\n " + mainFood + " " + firstSide + " " + secondSide + " " + extraSide;
    }

    /**
     * This method retrieves the number of a meal.
     * @return The number of a meal.
     */
    public int getMealNum() {
        return mealNumber;
    }

    /**
     * This method retrieves the main food of a meal.
     * @return The main food of a meal.
     */
    public String getMainFood() {
        return mainFood;
    }

    /**
     * This method retrieves the first side dish of a meal.
     * @return The first side dish of a meal.
     */
    public String getFirstSide() {
        return firstSide;
    }

    /**
     * This method retrieves the second side dish of a meal.
     * @return The second side dish of a meal.
     */
    public String getSecondSide() {
        return secondSide;
    }
    
    /**
     * This method retrieves any extra side food of the meal.
     * @return Any extra side food of the meal.
     */
    public String getExtraSide() {
        return extraSide;
    }

    /**
     * This method changes the main food of a meal.
     * @param newMainFood The new main food of a meal.
     */
    public void setMainFood(String newMainFood) {
        mainFood = newMainFood;
    }

    /**
     * This method changes the first side food of a meal.
     * @param newFirstSide The new first side food of a meal.
     */
    public void setFirstSide(String newFirstSide) {
        firstSide = newFirstSide;
    }

    /**
     * This method changes the second side food of a meal.
     * @param newSecondSide The new second side food of a meal.
     */
    public void setSecondSide(String newSecondSide) {
        secondSide = newSecondSide;
    }

    /**
     * This method changes the extra side food of a meal.
     * @param newExtraSide The new extra side food of a meal.
     */
    public void setExtraSide(String newExtraSide) {
        extraSide = newExtraSide;
    }

    /**
     * This method retrieves the description of a meal.
     * @return The description of a meal.
     */
    public String getMealDescription() {
        return "Meal Info: \n  Meal Number: " + mealNumber + "\n  Main Food: " + 
                mainFood + "\n  First Side: " + firstSide + "\n  Second Side: " + 
                secondSide + "\n  Extra: " + extraSide;
    }

}