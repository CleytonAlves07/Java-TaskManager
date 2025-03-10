package com.taskmanager.taskmanager.dto;


import java.time.LocalDateTime;

public class TaskCardDTO {
  private String title;
  private String description;
  private LocalDateTime creationDate;
  private boolean blocked;
  private String blockReason;

  public String getBlockReason() {
    return blockReason;
  }

  public void setBlockReason(String blockReason) {
    this.blockReason = blockReason;
  }

  public boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(boolean blocked) {
    this.blocked = blocked;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
