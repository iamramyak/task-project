package com.springboot.taskproject.repository;

import com.springboot.taskproject.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
