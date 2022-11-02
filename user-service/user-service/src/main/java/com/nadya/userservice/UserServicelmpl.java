/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.userservice;
import java.util.List;
import com.nadya.userservice.repository.UserRepository;
import com.nadya.userservice.dto.User;
import com.nadya.userservices.service.UserService;
import org.springframework.stereotype.Service;
/**
 *
 * @author HP
 */
@Service
public class UserServicelmpl implements UserService{
     private UserRepository userRepository;
    
    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(String id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public User deleteUser(String id) {
        return userRepository.deleteUser(id);
    }
    
}
