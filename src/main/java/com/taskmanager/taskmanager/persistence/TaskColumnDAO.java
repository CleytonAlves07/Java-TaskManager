package com.taskmanager.taskmanager.persistence;


import com.taskmanager.taskmanager.dto.TaskColumnDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskColumnDAO {
  private Connection connection;

  public TaskColumnDAO(Connection connection) {
    this.connection = connection;
  }

  public void save(TaskColumnDTO column) throws SQLException {
    String sql = "INSERT INTO task_columns (name, order, type) VALUES (?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, column.getName());
      stmt.setInt(2, column.getOrder());
      stmt.setString(3, column.getType());
      stmt.executeUpdate();
    }
  }
}
