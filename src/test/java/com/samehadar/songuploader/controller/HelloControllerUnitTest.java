package com.samehadar.songuploader.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.*;

public class HelloControllerUnitTest {

    @Test
    public void sayHelloWithName() {
        HelloController helloController = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = helloController.sayHello("Ignat", model);
        assertEquals("hello", result);
        assertEquals("Ignat", model.asMap().get("user"));
    }
}
