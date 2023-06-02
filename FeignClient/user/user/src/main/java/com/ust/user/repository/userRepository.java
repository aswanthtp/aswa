package com.ust.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.user.model.User;

public interface userRepository extends JpaRepository<User, Integer> {

}
