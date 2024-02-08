package com.example.ApiRest.service;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Driver;
import com.example.ApiRest.projection.CircuitProjection;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;



public interface CircuitService {

    List<Circuit> getAllCircuits();

    Optional<Circuit> getCircuitByName(String name  );

    Circuit saveCircuit(Circuit circuit);

    void deleteCircuitByName(String name);

    List<CircuitProjection> findAllBy();

    Page<CircuitProjection> getAllCircuitPaged(int pageNo, int pageSize, String sortBy, String sortDirection);



}