package com.example.GPECapp.controller;


import com.example.GPECapp.model.RegDHN;

import com.example.GPECapp.service.AlarmService;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IModel;

import java.nio.file.LinkOption;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/alarms")
public class AlarmsController {


    @Autowired
    private AlarmService alarmService;


    @GetMapping
    public String getAlarmsCO (
           LocalDateTime dataStart,
           LocalDateTime dataStop,
            Model model){
        List<RegDHN> regDHNS = alarmService.findAlarmsCO(dataStart, dataStop);
        model.addAttribute("regDHNS", regDHNS);
        return "alarms";
    }

}

