package com.JPA.Mapping.repository;

import com.JPA.Mapping.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
