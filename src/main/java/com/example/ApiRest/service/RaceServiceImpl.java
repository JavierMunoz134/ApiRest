package com.example.ApiRest.service;

import com.example.ApiRest.model.Circuit;
import com.example.ApiRest.model.Race;
import com.example.ApiRest.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @Autowired
    public RaceServiceImpl(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    @Override
    public List<Race> getRacesByCircuitId(Circuit circuitId) {
        return raceRepository.findByCircuit(circuitId);
    }

    @Override
    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public void deleteRace(Long raceId) {
        raceRepository.deleteById(raceId);
    }
}