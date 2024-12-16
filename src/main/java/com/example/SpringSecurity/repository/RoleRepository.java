package com.example.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringSecurity.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
