package com.spring.boot.repositories;

import com.spring.boot.models.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {

}
