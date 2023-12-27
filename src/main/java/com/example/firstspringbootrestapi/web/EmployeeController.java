package com.example.firstspringbootrestapi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello from Spring Boot";
    }
}
