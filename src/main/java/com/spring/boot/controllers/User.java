package com.spring.boot.controllers;

import com.spring.boot.models.UserDTO;
import com.spring.boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class User {

    @Autowired
    UserService userService;

    @GetMapping("all")
    public List<UserDTO> showAll(){
        return userService.findAll();
    }

    @PostMapping("add")
    public String addNew(@RequestBody UserDTO userData){
        return userService.saveUser(userData);
    }

    @PutMapping("update")
    public String updateUser(@RequestBody UserDTO newUser){
        return userService.updateUser(newUser);
    }

    @GetMapping("/find/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}
