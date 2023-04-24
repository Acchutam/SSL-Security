package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping(value = "/getData")
    public String getData()
    {
        return "Data accessed by HTTPS ";
    }
}
