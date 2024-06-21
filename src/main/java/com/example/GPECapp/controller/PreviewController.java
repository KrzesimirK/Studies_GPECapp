package com.example.GPECapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/preview")
public class PreviewController {

    @GetMapping
    public String showPreviewPage(){
        return "preview";
    }
}
