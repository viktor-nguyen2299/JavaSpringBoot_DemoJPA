package com.samsung.btjpa.repositories;

import com.samsung.btjpa.repositories.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
