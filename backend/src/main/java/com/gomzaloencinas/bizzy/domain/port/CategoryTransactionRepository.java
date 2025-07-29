package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.CategoryTransaction;

public interface CategoryTransactionRepository {
    CategoryTransaction save(CategoryTransaction categoryTransaction);
    CategoryTransaction findById(String id);
    void deleteById(String id);
}
