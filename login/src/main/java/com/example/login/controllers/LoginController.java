package com.example.login.controllers;

import com.example.login.model.LoginProcessor;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    public final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor){this.loginProcessor = loginProcessor;}

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model){

    loginProcessor.setUsername(username);
    loginProcessor.setPassword(password);
    boolean loggedIn = loginProcessor.login();

    if(loggedIn){
       return "redirect:/main";
    }
        model.addAttribute("message", "Login failed.");
        return "login.html";
    }


}
