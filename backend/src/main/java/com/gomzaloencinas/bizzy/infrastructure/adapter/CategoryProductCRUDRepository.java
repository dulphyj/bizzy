package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.CategoryProduct;
import org.springframework.data.repository.CrudRepository;

public interface CategoryProductCRUDRepository extends CrudRepository<CategoryProduct, String>{
}
