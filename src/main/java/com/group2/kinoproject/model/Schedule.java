package com.group2.kinoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.List;

@Entity
public class Schedule {

    @JoinColumn(name = "showing")
    List<Showing> schedule;
    @Id
    private int scheduleId;


}
