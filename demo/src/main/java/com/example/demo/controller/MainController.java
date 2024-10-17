package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String mainP() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String testP(){
        return "test page";
    }

    @GetMapping("/test2")
    public String testP2(){
        return "test page";
    }
}
