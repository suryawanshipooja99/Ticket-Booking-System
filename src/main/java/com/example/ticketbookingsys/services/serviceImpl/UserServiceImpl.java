package com.example.ticketbookingsys.services.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ticketbookingsys.entity.User;
import com.example.ticketbookingsys.repository.UserRepository;
import com.example.ticketbookingsys.services.UserService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id){
        return userRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("user not found with id:" + id));
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }  
}
