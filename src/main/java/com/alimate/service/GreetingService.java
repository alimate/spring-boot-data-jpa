package com.alimate.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/greet")
public class GreetingService {
    @RequestMapping(method = GET)
    public String itWorks() {
        return "It Works";
    }
}