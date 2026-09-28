package com.group2.kinoproject.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class Theater {

    // Hvordan kan jeg bedst represente de individuelle teatre?
    @Id
    private int theaterId;

    @Column(nullable = false)
    private int capacity;

    private String theaterName;


}
