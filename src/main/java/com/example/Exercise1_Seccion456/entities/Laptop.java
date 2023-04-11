package com.example.Exercise1_Seccion456.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String model;
    private Integer memorieRam;
    private Double price;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String model, Integer memorieRam, Double price) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.memorieRam = memorieRam;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(Integer memorieRam) {
        this.memorieRam = memorieRam;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
