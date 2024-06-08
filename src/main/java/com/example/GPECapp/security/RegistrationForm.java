package com.example.GPECapp.security;


import com.example.GPECapp.model.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    @NotEmpty
    private String password;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotNull
    private int workerNumber;
    private String department;
    private int phoneNumber;
    @NotEmpty
    private String authorities;
    @NotEmpty
    private String login;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                passwordEncoder.encode(password), firstName, lastName,
                workerNumber, department, phoneNumber, authorities, login);
    }

}
