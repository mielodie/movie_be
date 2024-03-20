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
@Table(name = "promotion")
public class Promotion extends BaseEntity{
    @Column(name = "percent")
    private Integer percent;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "type")
    private String type;
    @Column(name = "start_time")
    private LocalDate startTime;
    @Column(name = "end_time")
    private LocalDate endTime;
    @Column(name = "description")
    private String description;
    @Column(name = "name")
    private String name;
    @Column(name = "is_active")
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name = "rank_customer_id")
    @JsonBackReference
    private RankCustomer rankCustomer;
}
