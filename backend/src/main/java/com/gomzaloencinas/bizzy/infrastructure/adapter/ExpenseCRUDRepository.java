package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseCRUDRepository extends CrudRepository<Expense, String>{
}
