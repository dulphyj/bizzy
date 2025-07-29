package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.CategoryTransaction;
import com.gomzaloencinas.bizzy.domain.port.CategoryTransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryTransactionService {
    private final CategoryTransactionRepository categoryTransactionRepository;

    public CategoryTransaction save(CategoryTransaction categoryTransaction) {
        try {
            return categoryTransactionRepository.save(categoryTransaction);
        } catch (Exception e) {
            throw new RuntimeException("Error saving category transaction", e);
        }
    }

    public CategoryTransaction findById(String id) {
        try {
            return categoryTransactionRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding category transaction by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            categoryTransactionRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting category transaction by id: " + id, e);
        }
    }
}
