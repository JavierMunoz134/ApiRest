package com.example.ApiRest.service;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Driver;
import java.util.List;
import java.util.Optional;



public interface CircuitService {

    List<Circuit> getAllCircuits();

    Optional<Circuit> getCircuitByName(String name  );

    Circuit saveCircuit(Circuit circuit);

    void deleteCircuitByName(String name);


}