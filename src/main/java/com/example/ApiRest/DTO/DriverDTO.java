package com.example.ApiRest.DTO;

import com.example.ApiRest.model.Driver;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverDTO {
    private Long driverId;
    private String code;
    private String fullName;
    private String nationality;
    String constructor;

    public DriverDTO(Driver driver) {
        this.driverId = driver.getDriverId();
        this.code = driver.getCode();
        this.fullName = driver.getForename() + " " + driver.getSurname();
        this.nationality = driver.getNationality();
        this.constructor = driver.getConstructor() != null ? driver.getConstructor().getName() : null;
    }
}