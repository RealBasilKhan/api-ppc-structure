package com.api.apippcstructure.repository;

import com.api.apippcstructure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
