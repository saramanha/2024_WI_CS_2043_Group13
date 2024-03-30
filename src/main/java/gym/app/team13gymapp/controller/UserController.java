package gym.app.team13gymapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/profile")
    public String userProfile(HttpServletRequest request, Model model) {
        Cookie[] cookies = request.getCookies();
        String userInfo = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("user".equals(cookie.getName())) {
                    userInfo = cookie.getValue();
                    break;
                }
            }
        }
        if (userInfo != null) {
            // User info is found in the cookie, add it to the model and return the user profile view
            model.addAttribute("username", userInfo);
            return "redirect:/persons"; // Return to the profile view where user information can be displayed
        } else {
            // No user info found, redirect to the login page
            return "redirect:/login";
        }
    }
}
