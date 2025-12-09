package com.example.taskdemo.controller;

import com.example.taskdemo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

  private TaskService taskService;

  public TaskController(TaskService taskService) {
    this.taskService = taskService;
  }

  @GetMapping("/task/list")
  public String showTaskList(Model model) {
    return "task/list";
  }
}
