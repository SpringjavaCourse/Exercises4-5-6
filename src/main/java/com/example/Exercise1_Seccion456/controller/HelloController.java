package com.example.Exercise1_Seccion456.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/api/saludo")
    public String saludo(){
        System.out.println(this.message);
        return "Hola mundo, como estan?...";
    }
}
