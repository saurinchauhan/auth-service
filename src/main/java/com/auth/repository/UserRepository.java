package com.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.auth.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
