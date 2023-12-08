package com.JPA.Mapping.repository;

import com.JPA.Mapping.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
