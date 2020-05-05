package com.dayspring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

}
