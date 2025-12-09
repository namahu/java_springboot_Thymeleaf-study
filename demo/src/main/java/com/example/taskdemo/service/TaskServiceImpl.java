package com.example.taskdemo.service;

import com.example.taskdemo.model.Task;
import com.example.taskdemo.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  @Autowired
  TaskRepository taskRepository;

  @Override
  public List<Task> findAll() {
    return taskRepository.findAll();
  }
}
