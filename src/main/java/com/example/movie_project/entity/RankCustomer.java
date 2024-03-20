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
@Table(name = "rank_customer")
public class RankCustomer extends BaseEntity{
    @Column(name = "point")
    private Integer point;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "is_active")
    private Boolean isActive;
}
