package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/info")
    public String info() {
        Runtime runtime = Runtime.getRuntime();
        var availableProcessors = runtime.availableProcessors();
        var maxMemory = runtime.maxMemory();
        return "Available processors: " + availableProcessors + " Free memory: " + maxMemory;
    }
}
