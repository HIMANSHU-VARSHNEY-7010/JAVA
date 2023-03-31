package com.RestFulWebService.RestFulWebService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome-page")
    public String welcomePage(){
        return "Welcome to Spring boot";
    }
}
