package com.JPA.Mapping.repository;

import com.JPA.Mapping.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
