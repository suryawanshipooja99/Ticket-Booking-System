package com.example.ticketbookingsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticketbookingsys.entity.Ticket;
import com.example.ticketbookingsys.entity.User;
import com.example.ticketbookingsys.services.TicketService;
import com.example.ticketbookingsys.services.UserService;

@RestController
@RequestMapping("/ticketBooking")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private TicketService ticketService;

    //API for create user
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);

    }
    @GetMapping("/getUsers")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }
    @PostMapping("/saveTicket/{userId}")
    public Ticket saveTicketByUserId(@PathVariable int userId, @RequestBody Ticket ticket){
        return ticketService.saveTicketByUserId(userId, ticket);
    }
}
