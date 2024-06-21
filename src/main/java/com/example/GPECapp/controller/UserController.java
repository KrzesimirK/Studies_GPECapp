package com.example.GPECapp.controller;

import com.example.GPECapp.model.RegDHN;
import com.example.GPECapp.model.User;
import com.example.GPECapp.repository.RegRepository;
import com.example.GPECapp.repository.UserRepository;
import com.example.GPECapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String viewUsersPage(Model model){
        List<User> listUsers = userService.getAllUsers();
        model.addAttribute("listUser", listUsers);
        return "users";
    }



    //pobiera aktualnie przypisane dane
    @GetMapping("/edit/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long idAutoUser,
                                    Model model){
        User user = userService.getUserById(idAutoUser);
        model.addAttribute("user", user);
        return "register_update";
    }

    // wprowadza nowe dane
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable(value = "id")Long idAutoUser,
                             @ModelAttribute("user") @Valid User user,
                             Errors errors,
                             SessionStatus sessionStatus){
        if (errors.hasErrors()){
            user.setIdAutoUser(idAutoUser);
            return "register_update";
        } if (!user.getPassword().equals(user.getConfirmPassword())){
            errors.rejectValue("confirmPassword", "error.user","Hasła różną się od siebie!");
            user.setIdAutoUser(idAutoUser);
            return "register_update";
        }
        userService.updateUser(idAutoUser, user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable(value = "id") Long idAutoUser){
        userService.deleteUser(idAutoUser);
        return "redirect:/users";
    }


}
