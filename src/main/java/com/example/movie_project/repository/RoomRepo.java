package com.example.movie_project.repository;

import com.example.movie_project.entity.BillFood;
import com.example.movie_project.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {
}
