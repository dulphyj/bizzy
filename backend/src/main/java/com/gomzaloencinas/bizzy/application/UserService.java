package com.gomzaloencinas.bizzy.application;

import com.gomzaloencinas.bizzy.domain.model.User;
import com.gomzaloencinas.bizzy.domain.port.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User save(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("Error saving user", e);
        }
    }

    public User update(User user) {
        try {
            return userRepository.update(user);
        } catch (Exception e) {
            throw new RuntimeException("Error updating user", e);
        }
    }

    public void delete(User user) {
        try {
            userRepository.delete(user);
        } catch (Exception e) {
            throw new RuntimeException("Error deleting user", e);
        }
    }
}
