package com.example.ApiRest.repository;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
    List<Race> findByCircuit(Circuit circuit);
}