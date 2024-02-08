package com.example.ApiRest.repository;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Driver;
import com.example.ApiRest.projection.CircuitProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface CircuitRepository  extends JpaRepository<Circuit, Long> {

    List<CircuitProjection> findAllBy();
    void deleteByName(String name);

    Optional<Circuit> findByName(String name);
    Page<CircuitProjection> findAllProjectedBy(Pageable pageable);
}