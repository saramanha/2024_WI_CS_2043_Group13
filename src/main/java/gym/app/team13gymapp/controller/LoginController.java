package gym.app.team13gymapp.controller;

import gym.app.team13gymapp.model.Person;
import gym.app.team13gymapp.repository.PersonRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

@Controller
public class LoginController {

    private final PersonRepository personRepository;
    private final String secretKey = "YourSecretKey"; // Define your secret key for signing JWTs

    @Autowired
    public LoginController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        Optional<Person> foundPerson = personRepository.findByUserName(username);
        if (foundPerson.isPresent() && foundPerson.get().getPassword().equals(password)) {
            Person person = foundPerson.get();
            person.setPassword(null); // Clear the password before sending it back
            return ResponseEntity.ok().body(person);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login Failed");
        }
    }

}
