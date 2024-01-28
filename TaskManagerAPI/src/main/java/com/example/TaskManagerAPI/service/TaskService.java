package com.example.TaskManagerAPI.service;

import com.example.TaskManagerAPI.entity.Task;
import com.example.TaskManagerAPI.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;
    @Transactional
    public Task salvar(Task task){
        return taskRepository.save(task);
    }
}
