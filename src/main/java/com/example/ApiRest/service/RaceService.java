package com.example.ApiRest.service;

import com.example.ApiRest.model.Race;
import java.util.List;
import java.util.Optional;

public interface RaceService {
    List<Race> getAllRaces();
    Optional<Race> getRaceById(Long id);
    Race saveRace(Race race);
    void deleteRace(Long id);
}