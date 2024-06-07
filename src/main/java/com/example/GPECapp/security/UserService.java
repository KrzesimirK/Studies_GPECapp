package com.example.GPECapp.security;


import com.example.GPECapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.GPECapp.model.User;
import com.example.GPECapp.repository.UserRepository;

import java.util.List;


// SERVICE - metody z jakich korzystamy w programie
// CONTROLER - Warstwa, która przekazuje dane pomiędzy modelem a naszym widokiem np. widok html
// Config

// !!! MODEL - odzwierciedlenie BD po stronie kodu + założenia biznesowe (odzwierciedlenie logiki DB po stronie kodu)
// !!! w modelu metody w Java, w servisie metody SQL !!! - choć ja bym powiedziałze servis
// po prostu metody nie koniecznie sql

// CONTROLER - Warstwa, która przekazuje dane pomiędzy modelem a naszym widokiem
// np. widok html + odwołania do Servisu

// !!! SERVICE - komunikacja między naszą aplikacja a BD (pośrednik między zapytaniami
// a aplikacją)

// !!! Repozytorium - interfejs, mówi jakie metody mają być dostępne + je dziedziczy


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;
    private PasswordEncoder passwordEncoder;

    // czemu deklarujemy tutaj i używamy repo i password do metody UserControlet
    // (wcześniej był RegisterControler)

    // na co nam to potrzebne? + czemu taka nazwa?
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


    // powinny śmigać



    public List<User> getUsers(){
        return userRepo.findAll();
    }

    public User getSingleUser(long idAutoUser){
        return userRepo.findById(idAutoUser)
                .orElse(null);
    }

    // Metoda dodawania uzytkownika (ale czy prawidlowo zadziala??)
    // 1) czy zadziała autoinkrementacja? czy jednak musi być adnotacja?
    // 2) co z passwordEncoder ??
    public void addUser(User user){userRepo.save(user);}
    
    // też czy zadziała poprawnie
    public void deleteUserById(long idAutoUser){userRepo.deleteById(idAutoUser);}

}
