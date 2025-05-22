package com.gemini13.controller;

import com.gemini13.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {
        boolean success = loginService.login(username, password);
        if (success) {
            return "redirect:/dashboard";  // replace with actual dashboard page
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}

