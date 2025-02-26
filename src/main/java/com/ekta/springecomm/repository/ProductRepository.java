package com.ekta.springecomm.repository;

import com.ekta.springecomm.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
