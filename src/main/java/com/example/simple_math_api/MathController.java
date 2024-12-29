package com.example.simple_math_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/sum")
    public int calculateSum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
