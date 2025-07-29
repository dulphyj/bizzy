package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.Income;
import com.gomzaloencinas.bizzy.domain.port.IncomeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IncomeService {
    private final IncomeRepository incomeRepository;

    public Income save(Income income) {
        try {
            return incomeRepository.save(income);
        } catch (Exception e) {
            throw new RuntimeException("Error saving income", e);
        }
    }

    public Iterable<Income> findAll() {
        try {
            return incomeRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error finding all incomes", e);
        }
    }

    public Income findById(String id) {
        try {
            return incomeRepository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error finding income by id: " + id, e);
        }
    }

    public void deleteById(String id) {
        try {
            incomeRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting income by id: " + id, e);
        }
    }
}
