package com.cperceful.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to handle root request and /login
 */
@Controller
public class IndexController {

    @RequestMapping(value = "")
    public String index(){
        return "redirect:/login";
    }

    @RequestMapping
    public String login(Model model){
        model.addAttribute("title", "Login");
        return "login";
    }
}
