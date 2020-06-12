package com.rooniks.demos.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/api/v1/hello")
    public Map<String, String> sayHello() {
        Map<String, String> hello = new HashMap<>();
        hello.put("message", "Hello world! What's up?");
        return hello;
    }
}