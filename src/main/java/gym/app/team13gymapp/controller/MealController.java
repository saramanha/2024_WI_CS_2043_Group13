package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Meal;
import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.Transaction;
import gym.app.team13gymapp.repository.MealRepository;
import gym.app.team13gymapp.repository.PersonRepository;
import gym.app.team13gymapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MealController {

    private final MealRepository mealRepository;
    private final PersonRepository personRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public MealController(MealRepository mealRepository, PersonRepository personRepository, TransactionRepository transactionRepository) {
        this.mealRepository = mealRepository;
        this.personRepository = personRepository;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/meals")
    public String showMealList(@RequestParam(name = "personId", required = false) Integer personId, Model model) {
        if (personId != null) {
            System.out.println("personID not null");
            model.addAttribute("meals", mealRepository.findByPersonId(personId));
        } else {
            System.out.println("personID null");
            model.addAttribute("meals", new ArrayList<>());
        }
        return "meals";
    }



    @GetMapping("/meals/add")
    public String addMealForm(Model model) {
        model.addAttribute("meal", new Meal());
        return "add-meal";
    }

    @PostMapping("/meals/add")
    public String addMeal(@ModelAttribute("meal") Meal meal) {
        mealRepository.save(meal);
        Person person = personRepository.findById(meal.getPersonId()).orElse(null);
        if (person != null) {
            // Determine cost based on the user type and send tx
            double cost = "Gold".equals(person.getType()) ? 10 : 20;
            double updatedSpend = person.getSpend() + cost;
            person.setSpend(updatedSpend);
            Transaction transaction = new Transaction("meal", cost, meal.getPersonId());
            transactionRepository.save(transaction);
        }
        return "redirect:/meals?personId=" + meal.getPersonId();
    }


    @GetMapping("/meals/edit/{id}")
    public String editMealForm(@PathVariable("id") int id, Model model) {
        Meal meal = mealRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Meal Id:" + id));
        model.addAttribute("meal", meal);
        return "edit-meal";
    }

    @PostMapping("/meals/edit")
    public String updateMeal(@ModelAttribute("meal") Meal meal) {
        mealRepository.save(meal);
        return "redirect:/meals";
    }

    @GetMapping("/meals/delete/{id}")
    public String deleteMeal(@PathVariable int id) {
        Meal meal = mealRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Meal Id:" + id));
        mealRepository.delete(meal);
        return "redirect:/meals";
    }

}
