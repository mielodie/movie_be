package com.example.movie_project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie extends BaseEntity{
    @Column(name = "movie_duration")
    private Integer movieDuration;
    @Column(name = "end_time")
    private LocalDate endTime;
    @Column(name = "premiere_date")
    private LocalDate premiereDate;
    @Column(name = "description")
    private String description;
    @Column(name = "director")
    private String director;
    @Column(name = "image")
    private String image;
    @Column(name = "hero_image")
    private String heroImage;
    @Column(name = "languege")
    private String languege;
    @Column(name = "name")
    private String name;
    @Column(name = "trailer")
    private String trailer;
    @Column(name = "is_active")
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name = "movie_type_id")
    @JsonBackReference
    private MovieType movieType;
    @ManyToOne
    @JoinColumn(name = "rate_id")
    @JsonBackReference
    private Rate rate;
}
