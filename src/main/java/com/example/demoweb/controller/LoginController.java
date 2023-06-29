package com.example.demoweb.controller;


import com.example.demoweb.model.LoginUser;
import com.example.demoweb.processor.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String viewLog(){
        return "login.html";
    }

    @PostMapping("/")
    public String addLogin(LoginUser loginUser, Model model){
        loginProcessor.setUsername(loginUser.getUsername());
        loginProcessor.setPassword(loginUser.getPassword());
        if(loginProcessor.result()) {
            model.addAttribute("message","good");
            return "redirect:/main";
        }

        model.addAttribute("message","failed");

        return "login.html";
    }
}
