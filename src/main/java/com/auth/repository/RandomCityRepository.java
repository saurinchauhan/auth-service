package com.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.auth.domain.RandomCity;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
