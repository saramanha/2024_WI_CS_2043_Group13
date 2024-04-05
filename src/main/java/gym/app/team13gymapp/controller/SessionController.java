package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.TrainingSession;
import gym.app.team13gymapp.repository.PersonRepository;
import gym.app.team13gymapp.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SessionController {

    private final SessionRepository sessionRepository;
    private final PersonRepository personRepository;

    @Autowired
    public SessionController(SessionRepository sessionRepository, PersonRepository personRepository) {
        this.sessionRepository = sessionRepository;
        this.personRepository = personRepository;
    }

    @GetMapping("/sessions")
    public String showSessionList(Model model) {
        model.addAttribute("sessions", sessionRepository.findAll());
        model.addAttribute("session", new TrainingSession());
        return "training-session";
    }

    @GetMapping("/sessions/add")
    public String addSessionForm(Model model) {
        model.addAttribute("session", new TrainingSession());
        return "add-session";
    }

    @PostMapping("/sessions/add")
    public String addSession(@ModelAttribute TrainingSession trainingSession) {
        sessionRepository.save(trainingSession);
        //update person spend based on session cost
        Person person = personRepository.findById(trainingSession.getPersonId()).orElse(null);
        if (person != null) {
            double updatedSpend = person.getSpend() + trainingSession.getCost();
            person.setSpend(updatedSpend);
            personRepository.save(person);
        }
        return "redirect:/sessions";
    }

}
