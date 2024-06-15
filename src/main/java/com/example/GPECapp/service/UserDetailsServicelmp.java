package com.example.GPECapp.service;


import com.example.GPECapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.GPECapp.model.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Service
public class UserDetailsServicelmp implements UserDetailsService {

@Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("Użytkownik nie znaleziony");
        }

        UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(login);
        builder.password(user.getPassword());
        builder.roles(user.getRoles());
        return builder.build();
    }

}
