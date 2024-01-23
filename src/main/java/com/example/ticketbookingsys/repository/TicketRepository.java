package com.example.ticketbookingsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ticketbookingsys.entity.Ticket;

public interface TicketRepository extends JpaRepository <Ticket, Integer>{


    
} 