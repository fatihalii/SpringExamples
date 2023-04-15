package com.example.springboot2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page){
    page.addAttribute("username","Captain!");
    page.addAttribute("color","darkblue");
    return "home.html";
    }

}
