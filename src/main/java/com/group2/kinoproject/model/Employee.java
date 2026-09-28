package com.group2.kinoproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int employeeId;

    @Column(nullable = false)
    private String employeeName;

    @Column(nullable = false)
     private String employeePW;




}
