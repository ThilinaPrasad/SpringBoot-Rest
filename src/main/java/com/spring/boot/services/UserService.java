package com.spring.boot.services;

import com.spring.boot.models.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<UserDTO> findAll();

    String saveUser(UserDTO userData);

    String updateUser(UserDTO newUser);

    Optional<UserDTO> findById(Integer id);

    String deleteUser(Integer id);
}
