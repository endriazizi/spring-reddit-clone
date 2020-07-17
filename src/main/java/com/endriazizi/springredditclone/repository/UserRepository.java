package com.endriazizi.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endriazizi.springredditclone.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
