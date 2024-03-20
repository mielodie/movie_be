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
@Table(name = "confirm_email")
public class ConfirmEmail extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
    @Column(name = "required_time")
    private LocalDate requiredTime;
    @Column(name = "expired_time")
    private LocalDate expiredTime;
    @Column(name = "confirm_code")
    private String confirmCode;
    @Column(name = "is_confirm")
    private Boolean isConfirm;
}
