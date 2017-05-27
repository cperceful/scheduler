package com.cperceful.controllers;

import com.cperceful.models.Employee;
import com.cperceful.models.data.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Contoller to handle all /manager requests
 */

@Controller
@RequestMapping(value = "manager")
public class ManagerController {

    @Autowired
    EmployeeDao employeeDao;

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

    @RequestMapping(value = "addemployee", method = RequestMethod.GET)
    public String addEmployee(Model model){

        model.addAttribute("title", "Add Employee");
        model.addAttribute(new Employee());

        return "manager/addemployee";
    }
}
