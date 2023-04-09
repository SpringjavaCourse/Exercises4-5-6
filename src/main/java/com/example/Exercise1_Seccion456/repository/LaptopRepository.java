package com.example.Exercise1_Seccion456.repository;

import com.example.Exercise1_Seccion456.entities.Laptop;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
