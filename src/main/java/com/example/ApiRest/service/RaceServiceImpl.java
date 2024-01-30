package com.example.ApiRest.service;

import com.example.ApiRest.model.Race;
import com.example.ApiRest.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Race> getRaceById(Long id) {
        return raceRepository.findById(id);
    }

    @Override
    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public void deleteRace(Long id) {
        raceRepository.deleteById(id);
    }
}