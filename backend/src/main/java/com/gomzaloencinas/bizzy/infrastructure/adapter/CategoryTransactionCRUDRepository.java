package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.CategoryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface CategoryTransactionCRUDRepository extends CrudRepository<CategoryTransaction, String>{
}
