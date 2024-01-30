package com.example.ApiRest.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driverid")
    private Long id;

    @Column(name = "code", unique = true, nullable = false)
    private String code;
    @Column(nullable = false)
    private String forename;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    @JsonProperty("dateOfBirth")
    private LocalDate dob;
    @Column(nullable = false)
    private String nationality;
    private String url;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "constructorid")
    private Constructor constructor;

    @ManyToMany(mappedBy = "drivers")
    @JsonManagedReference
    private List<Race> races;

}

