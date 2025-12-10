package com.example.taskdemo.entity;

import java.time.LocalDateTime;

public class Task {

  private int id;
  private String title;
  private String description;
  private LocalDateTime due_date;
  private String status;
  private boolean isDeleted;
  private boolean isCompleted;
  private LocalDateTime created_at;
  private LocalDateTime updated_at;
  private LocalDateTime delete_at;

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
    return due_date;
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
    return created_at;
  }

  public LocalDateTime getUpdatedAt() {
    return updated_at;
  }

  public LocalDateTime getDeletedAt() {
    return delete_at;
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
    this.due_date = dueDate;
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
    this.created_at = createdAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updated_at = updatedAt;
  }

  public void setDeletedAt(LocalDateTime deletedAt) {
    this.delete_at = deletedAt;
  }
}
