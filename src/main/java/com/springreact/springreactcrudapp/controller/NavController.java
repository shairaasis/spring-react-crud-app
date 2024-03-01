package com.springreact.springreactcrudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/about")
    public String aboutPage() {
        return "pages/about"; // returns the name of the view
    }
}   
