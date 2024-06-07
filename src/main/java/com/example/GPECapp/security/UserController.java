package com.example.GPECapp.security;

import com.example.GPECapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // czy może jednak sam Controller (Rest nam upraszcza troche)
@RequiredArgsConstructor
@RequestMapping("/register")
public class UserController {



}
