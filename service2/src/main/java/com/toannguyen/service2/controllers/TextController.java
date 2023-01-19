package com.toannguyen.service2.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/hello")
public class TextController {
    private final WebClient client;
    @GetMapping()
     Mono<String> getText(){
         return client.get().uri("/text")
                 .retrieve()
                 .bodyToMono(String.class);
     }
}
