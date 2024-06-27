package com.springboot.taskproject.repository;

import com.springboot.taskproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepoistory extends JpaRepository<Task,Long> {
}
