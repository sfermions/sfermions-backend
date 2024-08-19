package com.sfermions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfermions.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
