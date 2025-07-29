package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.Expense;
import com.gomzaloencinas.bizzy.domain.port.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public Expense save(Expense expense) {
        try {
            return expenseRepository.save(expense);
        } catch (Exception e) {
            throw new RuntimeException("Error saving expense", e);
        }
    }

    public Iterable<Expense> findAll() {
        try {
            return expenseRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error finding all expenses", e);
        }
    }

    public Expense findById(String id) {
        try {
            return expenseRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding expense by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            expenseRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting expense by id: " + id, e);
        }
    }
}
