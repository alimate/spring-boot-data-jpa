package com.alimate.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingService {
    @RequestMapping(method = RequestMethod.GET)
    public String doGreet() {
        return "Hello";
    }
}