package com.example.movie_project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seat")
public class Seat extends BaseEntity{
    @Column(name = "number", nullable = false)
    private Integer number;
    @Column(name = "line", nullable = false)
    private String line;
    @Column(name = "is_active")
    private Boolean isActive ;
    @ManyToOne
    @JoinColumn(name = "seat_status_id")
    @JsonBackReference
    private SeatStatus seatStatus;
    @ManyToOne
    @JoinColumn(name = "room_id")
    @JsonBackReference
    private Room room;
    @ManyToOne
    @JoinColumn(name = "seat_type_id")
    @JsonBackReference
    private SeatType seatType;
}
