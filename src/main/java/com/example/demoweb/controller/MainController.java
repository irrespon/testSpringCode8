package com.example.demoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/start/{color}")
    public String start(@PathVariable String color, Model page){
        page.addAttribute("username","Alex");
        page.addAttribute("color",color);
        return "start.html";
    }
}
