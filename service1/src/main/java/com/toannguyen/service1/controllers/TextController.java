package com.toannguyen.service1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/text")
public class TextController {
    @GetMapping
    String SayHello(){
        return "Hello, world!";
    }
}
