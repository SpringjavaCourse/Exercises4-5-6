package com.example.Exercise1_Seccion456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/saludo")
    public String saludo(){
        return "Hola mundo, como estan?...";
    }
}
