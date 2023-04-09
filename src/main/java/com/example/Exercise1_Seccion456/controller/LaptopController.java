package com.example.Exercise1_Seccion456.controller;

import com.example.Exercise1_Seccion456.entities.Laptop;
import com.example.Exercise1_Seccion456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // Busca todos los laptops
    @GetMapping("/api/Laptops")
    public List<Laptop> getListLaptop(){

        return laptopRepository.findAll();
    }

    // Creamos laptop
    @PostMapping("/api/Laptops")
    public Laptop create(@RequestBody Laptop laptop){

        return laptopRepository.save(laptop);

    }

}
