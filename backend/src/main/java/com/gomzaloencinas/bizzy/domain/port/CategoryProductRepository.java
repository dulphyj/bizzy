package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.CategoryProduct;

public interface CategoryProductRepository {
    CategoryProduct save(CategoryProduct categoryProduct);
    CategoryProduct findById(String id);
    void deleteById(String id);
}
