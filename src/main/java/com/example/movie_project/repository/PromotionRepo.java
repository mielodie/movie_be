package com.example.movie_project.repository;

import com.example.movie_project.entity.BillFood;
import com.example.movie_project.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepo extends JpaRepository<Promotion, Long> {
}