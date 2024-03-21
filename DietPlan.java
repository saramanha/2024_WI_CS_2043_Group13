import java.util.*;

/**
 * This class represents a way to track diet plans.
 * @author Ben Macgillivray.
 */

public class DietPlan {

    /**
     * The number of a diet plan.
     */
    private int dietNumber;

    /**
     * The meals that are included in a diet plan.
     */
    private ArrayList<Meal> mealPlan;

    /**
     * The description of a diet plan.
     */
    private String dietDescription;

    /**
     * The starting point for diet plan numbers.
     */
    private static int assignedDietNum = 1;

    /**
     * This method constructs a diet plan containing a description of the diet plan.
     * @param descriptionIn The description of the diet plan.
     */
    public DietPlan(String descriptionIn) {
        dietNumber = assignedDietNum;
        mealPlan = new ArrayList<Meal>();
        dietDescription = descriptionIn;
        assignedDietNum++;
    }

    /**
     * This method retrieves the number of a diet plan.
     * @return The number of the diet plan
     */
    public int getDietNumber() {
        return dietNumber;
    }

    /**
     * This method retrieves the description of a diet plan.
     * @return The description of a diet plan.
     */
    public String getDescription() {
        return dietDescription;
    }

    /**
     * This method updates the description of a diet.
     * @param updatedDescription The updated description of a diet.
     */
    public void setDescription(String updatedDescription) {
        dietDescription = updatedDescription;
    }

    /**
     * This method adds a meal to a diet plan.
     * @param mealIn The meal to be added to the diet plan.
     */
    public void addMeal(Meal mealIn) {
        boolean isPresent = false;
        for(int i=0; i<mealPlan.size(); i++) {
            if(mealPlan.get(i).getMealNum() == mealIn.getMealNum) {
                isPresent = true;
            }
        }
        if(!isPresent) {
            mealPlan.add(mealIn);
        }
    }

    /**
     * This method removes a meal from a diet plan.
     * @param mealNumIn The meal to be removed from a diet plan.
     */
    public void removeMealFromPlan(int mealNumIn) {
        for(int i=0; i<mealPlan.size(); i++) {
            if(mealPlan.get(i) == mealNumIn) {
                mealPlan.remove(i);
            }
        }
    }

    /**
     * This method retrieves a list of the meals in a diet plan.
     * @return A list of the meals in a diet plan.
     */
    public String getDietPlan() {
        String result = "Diet Plan " + dietNumber + ": \n  ";
        for(int i=0; i<mealPlan.size(); i++) {
            result += mealPlan.get(i).getMealDescription() + "\n  ";
        }
        return result;
    }

}