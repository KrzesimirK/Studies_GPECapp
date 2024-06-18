package com.example.GPECapp.controller;

import com.example.GPECapp.model.User;
import com.example.GPECapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.*;
import java.util.List;



@Controller
public class AuthController {

   @GetMapping("/login")
    public String showLoginPage(){
       return "login";
   }

    @GetMapping("")
    public String showLoginPage1(){
        return "login";
    }

}
