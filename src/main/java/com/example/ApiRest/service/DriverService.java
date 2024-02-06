package com.example.ApiRest.service;

import com.example.ApiRest.DTO.DriverDTO;
import com.example.ApiRest.model.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<DriverDTO> getAllDrivers();
    Optional<Driver> getDriverByCode(String code);
    Driver saveDriver(Driver driver);
    void deleteDriverByCode(String code);
}