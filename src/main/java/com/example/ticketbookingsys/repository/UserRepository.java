package com.example.ticketbookingsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ticketbookingsys.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    
    
} 