package com.example.GPECapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alarms")
public class AlarmsController {

    @GetMapping
    public String showAlarmsPage(){
        return "alarms";
    }



}
