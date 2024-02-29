package com.example.ApiRest.service;

import com.example.ApiRest.DTO.DriverDTO;
import com.example.ApiRest.model.Driver;
import com.example.ApiRest.repository.DriverRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService{

    private final DriverRepository repository;

    @Autowired
    public DriverServiceImpl(DriverRepository repository){
        this.repository = repository;
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> drivers = repository.findAll();
        return drivers.stream().map(DriverDTO::new).collect(Collectors.toList());
    }

    @Override
    public Optional<Driver> getDriverByCode(String code) {
        return repository.findByCodeIgnoreCase(code);
    }


    @Override
    public Driver saveDriver(Driver driver) {
        return repository.save(driver);
    }

    @Override
    public void deleteDriverByCode(String code) {
        repository.deleteByCode(code);
    }





}