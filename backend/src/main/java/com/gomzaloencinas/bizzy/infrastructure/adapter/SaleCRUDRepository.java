package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleCRUDRepository extends CrudRepository<Sale, String>{
}
