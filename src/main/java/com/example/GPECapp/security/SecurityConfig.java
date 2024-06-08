package com.example.GPECapp.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
public class SecurityConfig {


    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }
//declare a PasswordEncoder bean, which we’ll use both when creating new users and when
// authenticating users at login.

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        List<UserDetails> usersList = new ArrayList<>();
        usersList.add(new User(
                "Pracownik1-Pamiec", encoder.encode("GPEC123"),
                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
        usersList.add(new User(
                "Pracownik2-Pamiec", encoder.encode("GPEC123"),
                Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"))));
        return new InMemoryUserDetailsManager(usersList);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests((authoR)->authoR
                        .requestMatchers("/alarms", "/preview").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/registration").hasRole("ADMIN")
                )
                .formLogin(formLogin-> formLogin.loginPage("/login")
                        .defaultSuccessUrl("/alarms")
                )
                .logout(logO -> {logO.
                        logoutUrl("/home");
                });
        return http.build(); // dlaczego to na końcu?

    }



}