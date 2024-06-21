package com.example.GPECapp.service;

import com.example.GPECapp.model.User;
import com.example.GPECapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // Wstrzyknięcie repozytorium użytkownika + kodera
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User findByLogin(String login){
        return userRepository.findByLogin(login);
    }

    public void createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long idAutoUser){
        return userRepository.findById(idAutoUser).orElse(null);
    }

    public User updateUser(Long idAutoUser, User userDetails){
        User user = userRepository.findById(idAutoUser).orElse(null); // tu trzeba zmienić


        user.setPassword(passwordEncoder.encode(userDetails.getPassword()));
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setWorkerNumber(userDetails.getWorkerNumber());
        user.setDepartment(userDetails.getDepartment());
        user.setPhoneNumber(userDetails.getPhoneNumber());
        user.setRoles(userDetails.getRoles());
        user.setLogin(userDetails.getLogin());

        return userRepository.save(user);
    }

    public void deleteUser(Long idAutoUser) {
        userRepository.deleteById(idAutoUser);
    }

}
