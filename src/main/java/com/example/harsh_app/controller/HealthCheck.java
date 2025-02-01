package com.example.harsh_app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/healthCheck")
     public void healthCheck(){
         System.out.println("OK ...... ");
     }
}
