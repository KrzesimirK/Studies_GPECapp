package com.example.GPECapp.controller;

import com.example.GPECapp.model.User;
import com.example.GPECapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }


    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") @Valid User user,
                               Errors errors,
                               SessionStatus sessionStatus)
    { if (errors.hasErrors()){
        return "register";
    } if (!user.getPassword().equals(user.getConfirmPassword())){
        errors.rejectValue("confirmPassword", "error.user","Hasła różną się od siebie!");
        return "register";
    }
        userService.createUser(user);
        return "redirect:/users";
    }

}
