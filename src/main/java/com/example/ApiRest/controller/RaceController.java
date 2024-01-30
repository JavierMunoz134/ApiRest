package com.example.ApiRest.controller;

import com.example.ApiRest.model.Race;
import com.example.ApiRest.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/races")
public class RaceController {
    private final RaceService raceService;

    @Autowired
    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping
    public ResponseEntity<List<Race>> getAllRaces() {
        return new ResponseEntity<>(raceService.getAllRaces(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Race> getRaceById(@PathVariable Long id) {
        return raceService.getRaceById(id)
                .map(race -> new ResponseEntity<>(race, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Race> saveRace(@RequestBody Race race) {
        return new ResponseEntity<>(raceService.saveRace(race), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRace(@PathVariable Long id) {
        raceService.deleteRace(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}