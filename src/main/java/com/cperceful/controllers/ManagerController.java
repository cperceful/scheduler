package com.cperceful.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Contoller to handle all /manager requests
 */

@Controller
@RequestMapping(value = "manager")
public class ManagerController {

    @RequestMapping(value = "")
    public String managerLanding(Model model){
        model.addAttribute("title", "Manager Landing");
        return "manager/manager";
    }

    @RequestMapping(value = "viewavailability")
    public String viewAvailability(Model model){
        model.addAttribute("title", "View Availability");
        return "manager/viewavailability";
    }

    @RequestMapping(value = "viewrequestsoff")
    public String viewRequestsOff(Model model){
        model.addAttribute("title", "View Requests Off");
        return "manager/viewrequestsoff";
    }

    @RequestMapping(value = "writeschedule")
    public String writeSchedule(Model model){
        model.addAttribute("title", "Write Schedule");
        return "manager/writeschedule";
    }
}
