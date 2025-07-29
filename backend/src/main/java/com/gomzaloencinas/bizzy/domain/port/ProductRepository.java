package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.Product;

public interface ProductRepository {
    Product save(Product product);
    Iterable<Product> findAll();
    Product findById(String id);
    void deleteById(String id);
}
