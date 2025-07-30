package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.Income;
import org.springframework.data.repository.CrudRepository;

public interface IncomeCRUDRepository extends CrudRepository<Income, String> {
}
