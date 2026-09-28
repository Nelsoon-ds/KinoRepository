package com.group2.kinoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class Showing {

    private final Duration CLEANING_BUFFER = Duration.ofMinutes(20);
    @Id
    private int showingId;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    private Theater theater;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Showing(int showingId, LocalDate date, Movie movie, Theater theater, LocalDateTime startTime, LocalDateTime endTime) {
        this.showingId = showingId;
        this.date = date;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.endTime = startTime.plus(CLEANING_BUFFER);
    }

    public Showing() {

    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
