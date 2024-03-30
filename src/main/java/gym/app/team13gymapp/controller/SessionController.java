package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.model.Session;
import gym.app.team13gymapp.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SessionController {

    private final SessionRepository sessionRepository;

    @Autowired
    public SessionController(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @GetMapping("/sessions")
    public String showSessionList(Model model) {
        model.addAttribute("sessions", sessionRepository.findAll());
        model.addAttribute("session", new Session());
        return "session"; // Change this to the correct template name, which seems to be "session.html"
    }

    @GetMapping("/sessions/add")
    public String addSessionForm(Model model) {
        model.addAttribute("session", new Session());
        return "add-session";
    }

    @PostMapping("/sessions/add")
    public String addSession(@ModelAttribute Session session) {
        sessionRepository.save(session);
        return "redirect:/sessions";
    }

    // Other methods for editing and deleting sessions as per your requirements

}
