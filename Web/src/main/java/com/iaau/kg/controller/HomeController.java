package com.iaau.kg.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/message")
    public String viewMessage(Model model) {
        //model.addAttribute("name", "Nurdoolot");
        model.addAttribute("message", "your message");

        return "message";
    }
}

