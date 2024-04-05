package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.Transaction;
import gym.app.team13gymapp.repository.PersonRepository;
import gym.app.team13gymapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.ArrayList;

@Controller
public class TransactionController {

    private final TransactionRepository transactionRepository;
    private final PersonRepository personRepository;

    @Autowired
    public TransactionController(TransactionRepository transactionRepository, PersonRepository personRepository) {
        this.transactionRepository = transactionRepository;
        this.personRepository = personRepository;
    }

    @GetMapping("/invoice")
    public String showInvoice(@RequestParam(name = "personId", required = false) Integer personId, Model model) {
        Person person = personRepository.findById(Long.valueOf(personId)).orElse(null);
        if (person != null) {
            model.addAttribute("transactions", transactionRepository.findByPersonId(personId));
            model.addAttribute("totalSpend", person.getSpend());
        } else {
            System.out.println("personID null in txController");
            model.addAttribute("transactions", new ArrayList<>());
        }
        return "invoice";
    }
}
