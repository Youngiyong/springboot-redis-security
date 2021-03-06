package com.example.cms.repository;

import com.example.cms.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
