package com.example.tag18_spring_web;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

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
    private List<Message> messages = new ArrayList<>();

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }
    @PostMapping("/messages")
    public void addMessage(@RequestBody Message message) {
        messages.add(message);
    }
}
