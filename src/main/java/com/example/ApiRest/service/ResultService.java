package com.example.ApiRest.service;

import com.example.ApiRest.model.Result;

import java.util.List;
import java.util.Optional;

public interface ResultService {
    List<Result> getAllResults();
    Optional<Result> getResultById(Long id);
    Result saveResult(Result result);
    void deleteResult(Long id);
}
