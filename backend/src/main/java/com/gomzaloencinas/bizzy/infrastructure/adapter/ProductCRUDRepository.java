package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCRUDRepository extends CrudRepository<Product, String> {
}
