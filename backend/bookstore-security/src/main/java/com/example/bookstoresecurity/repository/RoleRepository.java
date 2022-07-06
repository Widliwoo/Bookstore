package com.example.bookstoresecurity.repository;


import com.example.bookstoresecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}