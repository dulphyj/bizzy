package com.gomzaloencinas.bizzy.domain.port;

import com.gomzaloencinas.bizzy.domain.model.User;

public interface UserRepository {
    User save(User user);
    User update(User user);
    void delete(User user);
}
