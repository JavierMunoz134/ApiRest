package com.example.ApiRest.repository;

import com.example.ApiRest.model.Circuit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitRepository extends JpaRepository<Circuit, Long> {
    // Aquí puedes agregar consultas personalizadas si las necesitas
}

