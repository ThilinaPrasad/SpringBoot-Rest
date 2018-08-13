package com.spring.boot.services.impl;

import com.spring.boot.models.UserDTO;
import com.spring.boot.repositories.UserRepository;
import com.spring.boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
            List<UserDTO> allUsers = userRepository.findAll();
            return allUsers;
    }

    @Override
    public String saveUser(UserDTO userData) {
        userRepository.save(userData);
        return "success";
    }

    @Override
    public String updateUser(UserDTO newUser) {
        if(newUser.getId() != null){
            userRepository.save(newUser);
            return "Data updated successfully!";
        }else {
            return "Error happened!";
        }
    }

    @Override
    public Optional<UserDTO> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return "Deleted Successfully!";
    }
}
