package com.example.TaskManagerAPI.repository;

import com.example.TaskManagerAPI.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
