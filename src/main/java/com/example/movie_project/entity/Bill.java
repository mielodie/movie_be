package com.example.movie_project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bill")
public class Bill extends BaseEntity{
    @Column(name = "total_money")
    private Double totalMoney;
    @Column(name = "trading_code")
    private String tradingCode;
    @Column(name = "created_at")
    private LocalDate createdAt = LocalDate.now();
    @Column(name = "name")
    private String name;
    @Column(name = "updated_at")
    private LocalDate updatedAt = LocalDate.now();
    @Column(name = "is_active")
    private Boolean isActive;
    @ManyToOne
    @JoinColumn(name = "promotion_id")
    @JsonBackReference
    private Promotion promotion;
    @ManyToOne
    @JoinColumn(name = "bill_status_id")
    @JsonBackReference
    private BillStatus billStatus;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonBackReference
    private User customer;
}
