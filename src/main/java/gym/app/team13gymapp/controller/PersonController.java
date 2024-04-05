package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public String showPersonList(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        model.addAttribute("person", new Person());
        return "persons";
    }

    @GetMapping("/persons/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";
    }

    @PostMapping("/persons/add")
    public String addPerson(Person person) {
        double spend = "Gold".equals(person.getType()) ? 1000 : 750;
        person.setSpend(spend);
        personRepository.save(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/edit/{id}")
    public String editPersonForm(@PathVariable("id") long id, Model model) {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Person Id:" + id));
        model.addAttribute("person", person);
        return "edit-person";
    }

    @PostMapping("/persons/edit")
    public String updatePerson(@ModelAttribute("person") Person person) {
        personRepository.save(person);
        return "redirect:/";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        Person person = personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Person Id:" + id));
        personRepository.delete(person);
        return "redirect:/person";
    }

}

