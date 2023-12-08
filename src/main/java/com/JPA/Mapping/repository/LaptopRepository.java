package com.JPA.Mapping.repository;


import com.JPA.Mapping.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
