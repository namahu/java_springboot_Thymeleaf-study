package com.example.taskdemo.service;

import com.example.taskdemo.entity.Task;
import java.util.List;

public interface TaskService {
  List<Task> findAll();
}
