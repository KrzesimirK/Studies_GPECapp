package com.example.GPECapp.security;

import com.example.GPECapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    // czemu deklarujemy tutaj i używamy repo i password  do metody RegControlet
    private UserRepository userRepo;
    private PasswordEncoder passwordEncoder;

    // czemu na potrzebne?
    public RegistrationController(
            UserRepository userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }


    //co tu się dzieje - czemu mogę nazwać jak chce registerForm / Service / itp.
    // czy nie powinno być dokładnie registrationService?
    // omówić Dokładnie jak działają "/register" , "registration", itp.
    @GetMapping
    public String registerService() {
        return "registration"; //moja stronka http (templates)
    }

    @PostMapping//też do omówienia
    public String procesRegistration(RegistrationService regService){
        userRepo.save(regService.toUser(passwordEncoder));
        return "redirect:/register";
    }


}
