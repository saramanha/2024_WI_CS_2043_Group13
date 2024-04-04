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
        private String food;
        private String side;
        private int calories;
        private Long personId;

        public Meal() {}

        public Meal(String mainIn, String sideIn, int caloriesIn, Long personIdIn) {
            food = mainIn;
            side = sideIn;
            calories = caloriesIn;
            personId = personIdIn;
        }

        public Long getPersonId(){
            return personId;
        }

        public void setPersonId(Long personIdIn){
            personId = personIdIn;
        }

        public int getMealNum() {
            return mealNumber;
        }

        public String getFood() {
            return food;
        }

        public String getSide() {
            return side;
        }
        public int getCalories() { return calories;}
        public void setFood(String newFood) {
            food = newFood;
        }

        public void setSide(String newSide) {
            side = newSide;
        }

        public void setCalories(int caloriesIn) { calories = caloriesIn;}


        public String getMealDescription() {
            return "Meal Info: \n  Meal Number: " + mealNumber + "\n  Main Food: " +
                    food + "\n  Side: " + side + "\n  Calories: " + calories;
        }

    }