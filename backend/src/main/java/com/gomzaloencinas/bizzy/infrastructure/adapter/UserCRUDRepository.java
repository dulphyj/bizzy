package com.gomzaloencinas.bizzy.infrastructure.adapter;

import com.gomzaloencinas.bizzy.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUDRepository extends CrudRepository<User, String> {
}
