package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.repository.PersonRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
//?just pass the info through the url and forget cookies?
@Controller
public class LoginController {

    private final PersonRepository personRepository;

    @Autowired
    public LoginController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletResponse response) {
        Optional<Person> foundPerson = personRepository.findByUserName(username);
        if (foundPerson.isPresent()) {
            Person person = foundPerson.get();

            if (person.getPassword().equals(password)) {
                // Prepare user information for the cookie
                String userInfo = person.getId() + "|" + person.getUserName() + "|" + person.getEmail();
                // Create and configure the cookie
                Cookie userCookie = new Cookie("userInfo", userInfo);
                userCookie.setPath("/");
                userCookie.setMaxAge(7 * 24 * 60 * 60); // For example, make the cookie last for 7 days
                response.addCookie(userCookie);

                return "redirect:/persons"; //redirect to protected page
            }
        }
        return "redirect:/login?error=true";
    }
}
