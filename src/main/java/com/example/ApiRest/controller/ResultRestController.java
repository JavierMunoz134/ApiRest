package com.example.ApiRest.controller;

import com.example.ApiRest.model.Result;
import com.example.ApiRest.service.ResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultRestController {

    private final ResultServiceImpl resultService;

    @Autowired
    public ResultRestController(ResultServiceImpl resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Result>> getAllResults() {
        List<Result> results = resultService.findAll();
        return ResponseEntity.ok(results);
    }


}