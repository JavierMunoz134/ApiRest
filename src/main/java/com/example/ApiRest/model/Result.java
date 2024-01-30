package com.example.ApiRest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resultid")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "raceid", nullable = false)
    private Race race;

    @ManyToOne
    @JoinColumn(name = "driverid", nullable = false)
    private Driver driver;

    @Column(nullable = false)
    private Integer grid;

    private Integer position;

    @Column(nullable = false)
    private Integer points;


}
