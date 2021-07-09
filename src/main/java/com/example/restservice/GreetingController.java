package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/*
    When using Spring to build RESTful web services, HTTP request mapping are handled by a controller
    To identify it you need to use the @RestController annotation
 */
@RestController
public class GreetingController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    The @GetMapping annotation ensures that the HTTP GET requests to /greeting
    are mapped to the greeting() method
     */

    /*
    @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    If the name parameter is absent in the request, the defaultValue of "World" is used.

    So if there is a name the Request Parameter will be:
    /greeting?=Jonathan and return " Hello Jonathan!"

    If there is no name the default value will return
    "Hello World!"

    */

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}
