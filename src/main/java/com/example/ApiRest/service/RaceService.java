package com.example.ApiRest.service;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {

    List<Race> getAllRaces();

    List<Race> getRacesByCircuitId(Circuit circuitId);

    Race saveRace(Race race);

    void deleteRace(Long raceId);
}