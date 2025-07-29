package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.Expense;

public interface ExpenseRepository {
    Expense save(Expense expense);
    Iterable<Expense> findAll();
    Expense findById(String id);
    void deleteById(String id);
}
