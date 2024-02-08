package com.example.ApiRest.service;

import com.example.ApiRest.model.Result;
import com.example.ApiRest.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultService {


    List<Result> findAll();

}
