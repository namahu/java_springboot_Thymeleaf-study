package com.example.taskdemo.entity;

import java.time.LocalDateTime;

public class Task {

  private int id;
  private String title;
  private String description;
  private LocalDateTime dueDate;
  private String status;
  private boolean isDeleted;
  private boolean isCompleted;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime deletedAt;

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public LocalDateTime getDueDate() {
    return dueDate;
  }

  public String getStatus() {
    return status;
  }

  public boolean isDeleted() {
    return isDeleted;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public LocalDateTime getDeletedAt() {
    return deletedAt;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDueDate(LocalDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setDeleted(boolean deleted) {
    isDeleted = deleted;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setDeletedAt(LocalDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }
}
