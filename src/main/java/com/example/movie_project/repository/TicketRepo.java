package com.example.movie_project.repository;

import com.example.movie_project.entity.BillFood;
import com.example.movie_project.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {
}
