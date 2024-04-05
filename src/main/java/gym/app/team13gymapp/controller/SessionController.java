package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.TrainingSession;
import gym.app.team13gymapp.model.Transaction;
import gym.app.team13gymapp.repository.PersonRepository;
import gym.app.team13gymapp.repository.SessionRepository;
import gym.app.team13gymapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class SessionController {

    private final SessionRepository sessionRepository;
    private final PersonRepository personRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public SessionController(SessionRepository sessionRepository, PersonRepository personRepository, TransactionRepository transactionRepository) {
        this.sessionRepository = sessionRepository;
        this.personRepository = personRepository;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/sessions")
    public String showSessionList(@RequestParam(name = "personId", required = false) Integer personId, Model model) {
        if (personId != null) {
            System.out.println("personID not null");
            model.addAttribute("sessions", sessionRepository.findByPersonId(personId));
        } else {
            System.out.println("personID null");
            model.addAttribute("sessions", new ArrayList<>());
        }
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
            double sessionCost = "Gold".equals(person.getType()) ? 50 : 35;
            double updatedSpend = person.getSpend() + sessionCost;
            person.setSpend(updatedSpend);
            personRepository.save(person);
            Transaction transaction = new Transaction("session", sessionCost, trainingSession.getPersonId());
            transactionRepository.save(transaction);
        }
        return "redirect:/sessions?personId=" + trainingSession.getPersonId();
    }

}
