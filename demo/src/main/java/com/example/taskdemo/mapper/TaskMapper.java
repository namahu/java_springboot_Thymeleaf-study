package com.example.taskdemo.mapper;

import com.example.taskdemo.entity.Task;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TaskMapper {
  List<Task> findAll();
}
