package com.example.ApiRest.service;

import com.example.ApiRest.model.Constructor;
import com.example.ApiRest.model.Driver;

import java.util.List;
import java.util.Optional;

public interface ConstructorService {
    List<Constructor> getAllConstructors();
    Optional<Constructor> getConstructorByRef(String ref);
    Constructor saveConstructor(Constructor constructor);
    void deleteConstructorByRef(String ref);
}
