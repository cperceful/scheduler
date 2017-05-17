package com.cperceful.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for all /staff requests
 */
@Controller
@RequestMapping(value = "staff")
public class StaffController {

    @RequestMapping(value = "")
    public String home(Model model){
        model.addAttribute("title", "Staff Landing");
        return "staff/staff";
    }

    @RequestMapping(value = "requestoff")
    public String displayRequestOffForm(Model model){
        model.addAttribute("title", "Submit Request Off");
        return "staff/requestoff";
    }

    @RequestMapping(value = "availability")
    public String displayAvailabilityForm(Model model){
        model.addAttribute("title", "Availability");
        return "staff/availability";
    }
}
