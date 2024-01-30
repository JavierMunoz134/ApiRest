package com.example.ApiRest.repository;

import com.example.ApiRest.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Long> {
}
