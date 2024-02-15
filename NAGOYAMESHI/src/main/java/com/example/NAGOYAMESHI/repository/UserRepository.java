package com.example.NAGOYAMESHI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NAGOYAMESHI.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}