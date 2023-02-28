package com.example.springboot0AA2.repositories;

import com.example.springboot0AA2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
