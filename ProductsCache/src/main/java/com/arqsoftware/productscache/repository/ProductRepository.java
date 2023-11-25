package com.arqsoftware.productscache.repository;

import com.arqsoftware.productscache.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByName(String name);

    @Override
    Optional<Product> findById(Long id);
}
