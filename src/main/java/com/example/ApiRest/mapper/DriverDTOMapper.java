package com.example.ApiRest.mapper;

import org.springframework.stereotype.Service;
import java.util.function.Function;
import com.example.ApiRest.model.Driver;
import com.example.ApiRest.DTO.DriverDTO;

@Service
public class DriverDTOMapper implements Function<Driver, DriverDTO> {

    @Override
    public DriverDTO apply(Driver driver) {
        if (driver == null) {
            return null;
        }

        return new DriverDTO(driver);
    }
}