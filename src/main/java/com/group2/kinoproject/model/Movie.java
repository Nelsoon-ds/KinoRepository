package com.group2.kinoproject.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Movie {

    @Id
    private int movieId;

    private String movieName;

    @ManyToMany
    @JoinTable(name = "GenreMovie", 
    joinColumns = @JoinColumn(name = "movie_id"), 
    inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    private int imdbRating;

    private int duration;

    private String director;

    private int releaseYear;



}
