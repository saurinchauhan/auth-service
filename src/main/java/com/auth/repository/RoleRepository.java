package com.auth.repository;

import org.springframework.data.repository.CrudRepository;

import com.auth.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
