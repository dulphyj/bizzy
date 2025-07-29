package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.CategoryProduct;
import com.gomzaloencinas.bizzy.domain.port.CategoryProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryProductService {
    private final CategoryProductRepository categoryProductRepository;

    public CategoryProduct save(CategoryProduct categoryProduct) {
        try {
            return categoryProductRepository.save(categoryProduct);
        } catch (Exception e) {
            throw new RuntimeException("Error saving category product", e);
        }
    }

    public CategoryProduct findById(String id) {
        try {
            return categoryProductRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding category product by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            categoryProductRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting category product by id: " + id, e);
        }
    }
}
