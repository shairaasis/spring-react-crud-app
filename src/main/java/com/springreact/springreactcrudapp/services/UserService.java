package com.springreact.springreactcrudapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springreact.springreactcrudapp.model.User;
import com.springreact.springreactcrudapp.repository.UserRepository;

@Service
public class UserService {

    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    @SuppressWarnings("null")
    public User addUser(User user) {
        return userRepository.save(user);
    }


    @SuppressWarnings("null")
    public void deleteUser(@PathVariable("id") Long id) {
        
        userRepository.deleteById(id);
    }
    
}
