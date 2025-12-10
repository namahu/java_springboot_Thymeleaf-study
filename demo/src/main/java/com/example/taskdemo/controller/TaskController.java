package com.example.taskdemo.controller;

import com.example.taskdemo.entity.Task;
import com.example.taskdemo.service.TaskService;
import java.util.List;
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
    List<Task> taskList = taskService.findAll();

    System.out.println(taskList.get(0).getDueDate());

    model.addAttribute("taskList", taskList);
    return "task/list";
  }
}
