package com.example.springbootexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/get/all")
    public ResponseEntity<String> getAll(){
        return ResponseEntity.ok("It is working");
    }
}
