package com.auth.service;

import java.util.List;

import com.auth.domain.RandomCity;
import com.auth.domain.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
