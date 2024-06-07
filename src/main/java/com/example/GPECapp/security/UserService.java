package com.example.GPECapp.security;


import com.example.GPECapp.model.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;


// SERVICE - metody z jakich korzystamy w programie
// Controler - Warstwa, która przekazuje dane pomiędzy modelem a naszym widokiem np. widok html
// Config



@Data
public class RegistrationService {

    private String password;
    private String firstName;
    private String lastName;
    private int workerNumber;
    private String department;
    private int phoneNumber;
    private String authorities;
    private String login;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                passwordEncoder.encode(password), firstName, lastName, workerNumber,
                department, phoneNumber, authorities, login);
    }

}
