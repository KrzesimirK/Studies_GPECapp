package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class AlarmsController {

    @GetMapping("/alarms")
    public String alarms() {

        return "alarms";
    }

}
