package com.example.movie_project.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cinema")
public class Cinema extends BaseEntity{
    @Column(name = "address")
    private String address;
    @Column(name = "description")
    @Nullable
    private String description;
    @Column(name = "code")
    private String code;
    @Column(name = "name_of_cinema")
    private String nameOfCinema;
    @Column(name = "is_active")
    private Boolean isActive;
}
