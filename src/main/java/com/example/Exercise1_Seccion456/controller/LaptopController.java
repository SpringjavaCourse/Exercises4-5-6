package com.example.Exercise1_Seccion456.controller;

import com.example.Exercise1_Seccion456.entities.Laptop;
import com.example.Exercise1_Seccion456.repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    //Constructor
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }


    /**
     * Busca todos los laptops
     * @return List<Laptop> Recupera y devuelve todos los laptops de BD
     */
    @GetMapping("/api/Laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll(); // Recupera y devuelve todos los laptops de BD
    }

    /**
     * Buscar Laptop por ID
     * @param id id tipo Long a buscar
     * @return ResponseEntity<Laptop> Respuesta Http
     */
    @GetMapping("/api/Laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){

        Optional<Laptop> LaptopOpt = laptopRepository.findById(id);

        //Option 1
        return LaptopOpt.isPresent() ? ResponseEntity.ok(LaptopOpt.get()) : ResponseEntity.notFound().build();
        //Option 2
        //return LaptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    // Creamos laptop
    @PostMapping("/api/Laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop){

        if(laptop.getId() != null){ // verificamos si existe
            System.out.println("trying to create a Laptop with id");
            return ResponseEntity.badRequest().build();
        }

        Laptop result =  laptopRepository.save(laptop);
        return  ResponseEntity.ok(result);
    }

}
