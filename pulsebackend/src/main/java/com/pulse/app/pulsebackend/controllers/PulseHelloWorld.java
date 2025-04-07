package com.pulse.app.pulsebackend.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PulseHelloWorld {


    @GetMapping("/hello")
    public String helloWorld() {
        log.debug("Hello World Controller");
        return "Hello World";
    }
}
