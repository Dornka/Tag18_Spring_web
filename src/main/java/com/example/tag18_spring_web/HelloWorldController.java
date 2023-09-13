package com.example.tag18_spring_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello, " + name;
    }
}
