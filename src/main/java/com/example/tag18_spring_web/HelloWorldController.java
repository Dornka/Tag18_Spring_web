package com.example.tag18_spring_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping()
    public String getHelloWorld(){
        return "Hello, World";
    }


    @GetMapping("/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello, " + name;
    }
}
