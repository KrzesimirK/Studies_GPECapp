package com.example.GPECapp.security;

import com.example.GPECapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {

    // czemu deklarujemy tutaj i używamy repo i password  do metody RegControlet
    private UserRepository userRepo;
    private PasswordEncoder passwordEncoder;

    // czemu na potrzebne? + czemu taka nazwa?
    public UserController(
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
    public String procesRegistration(UserService regService){
        userRepo.save(regService.toUser(passwordEncoder));
        return "redirect:/register";
    }


}
