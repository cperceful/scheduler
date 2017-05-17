package com.cperceful.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for /schedule requests
 */

@Controller
@RequestMapping(value = "schedule")
public class ScheduleController {

    @RequestMapping(value = "")
    public String displaySchedule(Model model){

        model.addAttribute("title", "Schedule");
        return "schedule";
    }
}
