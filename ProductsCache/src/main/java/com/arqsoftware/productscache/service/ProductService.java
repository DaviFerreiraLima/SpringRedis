package com.arqsoftware.productscache.service;

import com.arqsoftware.productscache.entity.Product;
import com.arqsoftware.productscache.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Cacheable("products")
    public Product getProductById(long productId){

        System.out.println("procurando produto");
        return productRepository.findById(productId).orElseThrow(
                ()->  new RuntimeException());
    }
}