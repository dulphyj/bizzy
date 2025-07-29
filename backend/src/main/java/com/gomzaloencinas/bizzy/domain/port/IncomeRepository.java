package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.Income;

public interface IncomeRepository {
    Income save(Income income);
    Iterable<Income> findAll();
    Income findById(String id);
    void deleteById(String id);
}
