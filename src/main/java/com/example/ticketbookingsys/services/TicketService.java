package com.example.ticketbookingsys.services;

import org.springframework.stereotype.Service;
import com.example.ticketbookingsys.entity.Ticket;

@Service
public interface TicketService {

    public Ticket saveTicketByUserId(int userId, Ticket ticket);

}
