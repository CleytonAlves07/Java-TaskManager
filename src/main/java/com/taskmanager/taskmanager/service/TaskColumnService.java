package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.dto.TaskColumnDTO;
import com.taskmanager.taskmanager.persistence.TaskColumnDAO;

import java.sql.Connection;

public class TaskColumnService {
  private Connection connection;

  public TaskColumnService(Connection connection) {
    this.connection = connection;
  }

  public void createTaskColumn(String name, int order, String type) {
    TaskColumnDTO column = new TaskColumnDTO();
    column.setName(name);
    column.setOrder(order);
    column.setType(type);

    TaskColumnDAO columnDAO = new TaskColumnDAO(connection);
    try {
      columnDAO.save(column);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
