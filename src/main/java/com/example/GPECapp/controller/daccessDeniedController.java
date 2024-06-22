package com.example.GPECapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/403")
public class daccessDeniedController {

    @GetMapping()
    public String show403Page(){
        return "403";
    }

}
