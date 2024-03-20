package com.example.movie_project.entity;

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
@Table(name = "movie_type")
public class MovieType extends BaseEntity{
    @Column(name = "movie_type_name")
    private String movieTypeName;
    @Column(name = "is_active")
    private Boolean isActive;
}
