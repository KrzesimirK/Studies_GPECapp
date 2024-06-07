package com.example.GPECapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class PreviewController {

    @GetMapping("/preview")
    public String preview() {

        return "preview";
    }
}
