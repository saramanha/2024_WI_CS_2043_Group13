package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.Session;
import gym.app.team13gymapp.repository.PersonRepository;
import gym.app.team13gymapp.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {

    private final SessionRepository personRepository;

    @Autowired
    public SessionController(SessionRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/session")
    public String showPersonList(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        model.addAttribute("git ", new Session());
        return "session";
    }

    @GetMapping("/session/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Session());
        return "add-session";
    }

    @PostMapping("/session/add")
    public String addPerson(Session person) {
        personRepository.save(person);
        return "redirect:/session";
    }
//
//    @GetMapping("/persons/edit/{id}")
//    public String editPersonForm(@PathVariable("id") long id, Model model) {
//        Session person = personRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid Person Id:" + id));
//        model.addAttribute("person", person);
//        return "edit-person";
//    }
//
//    @PostMapping("/persons/edit")
//    public String updatePerson(@ModelAttribute("person") Session person) {
//        personRepository.save(person);
//        return "redirect:/";
//    }
//
//    @GetMapping("/persons/delete/{id}")
//    public String deletePerson(@PathVariable Long id) {
//        Session person = personRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid Person Id:" + id));
//        personRepository.delete(person);
//        return "redirect:/person";
//    }

}

