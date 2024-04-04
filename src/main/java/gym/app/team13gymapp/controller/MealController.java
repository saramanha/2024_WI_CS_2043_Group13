package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Meal;
import gym.app.team13gymapp.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MealController {

    private final MealRepository mealRepository;

    @Autowired
    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
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
