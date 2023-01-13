package com.ddgroup.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("welcomeMessage", "Service Works");

        return "index";
    }
}
