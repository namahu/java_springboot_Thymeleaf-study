package com.example.taskdemo.repository;

import com.example.taskdemo.entity.Task;
import com.example.taskdemo.mapper.TaskMapper;
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
