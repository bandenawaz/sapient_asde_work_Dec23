package com.example.springcrud.controller;

import com.example.springcrud.exception.ResourceNotFoundException;
import com.example.springcrud.model.User;
import com.example.springcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        
        return userRepository.findAll();
    }

    
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        
        Random random = new Random();
        user.setId((user.getFirstName() + user.getLastName() 
            + user.getEmailId()) + random.nextInt(1000));

        return userRepository.save(user);
    }

    
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById
                (@PathVariable String id) {
        
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));

        return ResponseEntity.ok(user);
    }

    
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser
       (@PathVariable String id, @RequestBody User userDetails) {
        
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                   ("User not exist with id :" + id));

        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        user.setEmailId(userDetails.getEmailId());
        User updatedUser = userRepository.save(user);

        return ResponseEntity.ok(updatedUser);
    }

    
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteUser
                 (@PathVariable String id) {
        
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException
                      ("User not exist with id :" + id));

        userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);

        return ResponseEntity.ok(response);
    }
}