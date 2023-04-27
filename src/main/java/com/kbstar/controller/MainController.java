package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main() {
        return "index";
    }

    @RequestMapping("/thebestcat")
    public String thebestcat(Model model) {
        model.addAttribute("center", "thebestcat");
        return "index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("center", "about");
        return "index";
    }

    @RequestMapping("/resume")
    public String resume(Model model) {
        model.addAttribute("center", "resume");
        return "index";
    }

    @RequestMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("center", "portfolio");
        return "index";
    }

    @RequestMapping("/services")
    public String services(Model model) {
        model.addAttribute("center", "services");
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("center", "contact");
        return "index";
    }
}