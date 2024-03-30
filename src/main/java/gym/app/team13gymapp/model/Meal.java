package gym.app.team13gymapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class represents a meal.
 * @author Ben Macgillivray.
 */
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private int mealNumber;
        private String mainFood;
        private String firstSide;
        private String secondSide;
        private String extraSide;
        private static int assignedMealNum = 1;
        private Long personId;

        public Meal()
        {

        }
        /**
         * This method constructs a meal containing the main food of a meal, the first
         * side of a meal, the second side of a meal, and any extra side foods of a meal.
         * @param mainIn The main food of a meal.
         * @param firstSideIn The first side food of a meal.
         * @param secondSideIn The second side food of a meal.
         * @param extraIn Any extra side food of a meal.
         */
        public Meal(String mainIn, String firstSideIn, String secondSideIn, String extraIn, Long personIdIn) {
            mealNumber = assignedMealNum;
            mainFood = mainIn;
            firstSide = firstSideIn;
            secondSide = secondSideIn;
            extraSide = extraIn;
            assignedMealNum++;
            personId = personIdIn;
        }

        public Long getPersonId(){
            return personId;
        }

        public void setPersonId(Long personIdIn){
            personId = personIdIn;
        }
        public String toString() {
            return "The meal is meal option " + mealNumber + "\n " + mainFood + " " + firstSide + " " + secondSide + " " + extraSide;
        }


        public int getMealNum() {
            return mealNumber;
        }

        public String getMainFood() {
            return mainFood;
        }

        public String getFirstSide() {
            return firstSide;
        }


        public String getSecondSide() {
            return secondSide;
        }


        public String getExtraSide() {
            return extraSide;
        }

        public void setMainFood(String newMainFood) {
            mainFood = newMainFood;
        }

        public void setFirstSide(String newFirstSide) {
            firstSide = newFirstSide;
        }

        public void setSecondSide(String newSecondSide) {
            secondSide = newSecondSide;
        }

        public void setExtraSide(String newExtraSide) {
            extraSide = newExtraSide;
        }

        public String getMealDescription() {
            return "Meal Info: \n  Meal Number: " + mealNumber + "\n  Main Food: " +
                    mainFood + "\n  First Side: " + firstSide + "\n  Second Side: " +
                    secondSide + "\n  Extra: " + extraSide;
        }

    }