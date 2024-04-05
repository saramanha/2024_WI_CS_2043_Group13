package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.TrainingSession;
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
        return "redirect:/sessions";
    }

}
