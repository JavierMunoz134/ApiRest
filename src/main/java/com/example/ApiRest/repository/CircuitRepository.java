package com.example.ApiRest.repository;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CircuitRepository  extends JpaRepository<Circuit, Long> {

    void deleteByName(String name);

    Optional<Circuit> findByName(String name);
}