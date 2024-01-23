package com.example.ticketbookingsys.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketbookingsys.entity.Ticket;
import com.example.ticketbookingsys.entity.User;
import com.example.ticketbookingsys.repository.TicketRepository;
import com.example.ticketbookingsys.repository.UserRepository;
import com.example.ticketbookingsys.services.TicketService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository; //to communicate with Database

    @Autowired
    private UserRepository userRepository;

    @Override
    public Ticket saveTicketByUserId(int userId, Ticket ticket) {
        User existingUser = userRepository.findById(userId)
                    .orElseThrow(()-> new EntityNotFoundException("user not found with id:" + userId));//find user by user id
      
        //set existing user to ticket
        ticket.setUser(existingUser);
        //save the ticket
        return ticketRepository.save(ticket);
        
    }
    
    
}
