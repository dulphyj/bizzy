package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.Product;
import com.gomzaloencinas.bizzy.domain.port.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product save(Product product) {
        try {
            return productRepository.save(product);
        } catch (Exception e) {
            throw new RuntimeException("Error saving product", e);
        }
    }

    public Iterable<Product> findAll() {
        try {
            return productRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error finding all products", e);
        }
    }

    public Product findById(String id) {
        try {
            return productRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding product by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting product by id: " + id, e);
        }
    }
}
