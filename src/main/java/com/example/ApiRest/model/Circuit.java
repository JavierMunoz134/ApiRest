package com.example.ApiRest.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "circuits")
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "circuitid")
    private Long id;

    @Column(name = "circuitref", unique = true, nullable = false)
    private String circuitRef;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String country;

    private Double lat;
    private Double lng;
    private Integer alt;
    private String url;
}
