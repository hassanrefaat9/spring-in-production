package com.example.springinprod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private Environment env;



    @GetMapping({"/", "/index"})
    public String welcomePage(Model model){
                model.addAttribute("environments",env.getActiveProfiles());

        return "index";
    }
}
