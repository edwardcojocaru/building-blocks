package com.edw.restservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eduard.Cojocaru
 */
@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }

    @GetMapping("helloworldbean")
    public UserDetails helloWorldBean() {
        return new UserDetails("me", "you", "buc");
    }
}
