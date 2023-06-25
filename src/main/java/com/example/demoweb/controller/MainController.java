package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/start")
    public String start(Model page){
        page.addAttribute("username","Alex");
        page.addAttribute("color","red");
        return "start.html";
    }
}
