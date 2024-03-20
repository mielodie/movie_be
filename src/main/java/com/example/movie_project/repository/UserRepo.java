package com.example.movie_project.repository;

import com.example.movie_project.entity.BillFood;
import com.example.movie_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByPhoneNumber(String phoneNumber);
}
