package com.example.taskdemo.repository;

import com.example.taskdemo.model.Task;
import com.example.taskdemo.repository.mapper.TaskMapper;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

  private final TaskMapper taskMapper;

  public TaskRepository(TaskMapper taskMapper) {
    this.taskMapper = taskMapper;
  }

  public List<Task> findAll() {
    return taskMapper.findAll();
  }
}
