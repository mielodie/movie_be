package com.example.movie_project.repository;

import com.example.movie_project.entity.BillFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillFoodRepo extends JpaRepository<BillFood, Long> {
}
