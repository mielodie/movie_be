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
@Table(name = "user_status")
public class UserStatus extends BaseEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "name", nullable = false)
    private String name;
}
