package com.rooniks.demos.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @Value("${dummyValue}")
    private String dummyValue;

    @GetMapping(value = "/api/v1/hello")
    public Map<String, String> sayHello() {
        Map<String, String> hello = new HashMap<>();
        hello.put("message", "Hello world! What's up?");
        return hello;
    }

    // Dummy api to test out how config parameters work in Heroku
    @GetMapping(value = "api/v1/configvalue")
    public Map<String, String> getConfigValue() {
        Map<String, String> config = new HashMap<>();
        config.put("value", dummyValue);
        return config;
    }
}