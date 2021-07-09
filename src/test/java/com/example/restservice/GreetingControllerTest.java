package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingControllerTest {
    @Test
    public void testGreeting() {
        Greeting actualGreetingResult = (new GreetingController()).greeting("Name");
        assertEquals("Hello World", actualGreetingResult.getContent());
        assertEquals(1L, actualGreetingResult.getId());
    }




}

