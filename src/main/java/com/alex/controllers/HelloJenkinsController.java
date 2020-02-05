package com.alex.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkinsController {

    @GetMapping("/")
    public String heelo() {
        return "<h1>Hello Jenkins!!!!</h1>";
    }
}
