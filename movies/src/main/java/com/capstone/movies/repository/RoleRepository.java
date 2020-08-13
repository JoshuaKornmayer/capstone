package com.capstone.movies.repository;

import java.util.Optional;

import com.capstone.movies.models.ERole;
import com.capstone.movies.models.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}