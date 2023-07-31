package com.learning.springbootrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springbootrestcrud.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
