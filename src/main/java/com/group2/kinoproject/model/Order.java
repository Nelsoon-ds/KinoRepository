package com.group2.kinoproject.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Order {

    @Id
    private int orderId;

    @OneToMany
    @JoinColumn(name = "movie_id")
    private List<Movie> movies;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
