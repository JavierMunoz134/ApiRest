package com.example.ApiRest.controller;


import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.service.CircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/circuits")
public class CircuitController {
    private final CircuitService circuitService;

    @Autowired
    public CircuitController(CircuitService circuitService) {
        this.circuitService = circuitService;
    }

    @GetMapping
    public ResponseEntity<List<Circuit>> getAllCircuits() {
        return ResponseEntity.ok(circuitService.getAllCircuits());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Circuit> getCircuitById(@PathVariable Long id) {
        return circuitService.getCircuitById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Circuit> saveCircuit(@RequestBody Circuit circuit) {
        return ResponseEntity.ok(circuitService.saveCircuit(circuit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCircuit(@PathVariable Long id) {
        circuitService.deleteCircuit(id);
        return ResponseEntity.noContent().build();
    }
}
