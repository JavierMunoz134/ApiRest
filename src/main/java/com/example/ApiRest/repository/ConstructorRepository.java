package com.example.ApiRest.repository;

import com.example.ApiRest.model.Constructor;
import com.example.ApiRest.model.Driver;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor, Long> {
    Optional<Constructor> findByRefIgnoreCase(String ref);
    void deleteByRefIgnoreCase(String ref);
}
