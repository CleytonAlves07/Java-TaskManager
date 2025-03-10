package com.taskmanager.taskmanager.dto;

import java.util.List;

public class BoardDTO {
  private String name;
  private List<TaskColumnDTO> columns;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<TaskColumnDTO> getColumns() {
    return columns;
  }

  public void setColumns(List<TaskColumnDTO> columns) {
    this.columns = columns;
  }
}
