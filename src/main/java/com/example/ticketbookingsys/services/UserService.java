package com.example.ticketbookingsys.services;

import java.util.List;

import com.example.ticketbookingsys.entity.User;

public interface UserService {

    public User saveUser(User user);

    public User getUserById(int id);

    public List<User> findAllUsers();

    
} 