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

    //definicion metodo guardar circuito
    Circuit saveCircuit(Circuit circuit);

    //definicion metodo borrar driver por codigo
    void deleteCircuitByName(String name);

    Page<CircuitProjection> getAllCircuitPaged(int pageNo, int pageSize, String sortBy, String sortDirection);

}