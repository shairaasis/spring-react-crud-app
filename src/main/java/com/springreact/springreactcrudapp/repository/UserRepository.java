package com.springreact.springreactcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springreact.springreactcrudapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    @Query("SELECT CASE WHEN COUNT(u) > 0 THEN TRUE ELSE FALSE END FROM User u WHERE u.email = ?1")
    Boolean selectExistsEmail(String email);
}
