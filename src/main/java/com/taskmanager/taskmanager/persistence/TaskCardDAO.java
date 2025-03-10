package com.taskmanager.taskmanager.persistence;


import com.taskmanager.taskmanager.dto.TaskCardDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskCardDAO {
  private Connection connection;

  public TaskCardDAO(Connection connection) {
    this.connection = connection;
  }

  public void save(TaskCardDTO card) throws SQLException {
    String sql = "INSERT INTO task_cards (title, description, creation_date, blocked, block_reason) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, card.getTitle());
      stmt.setString(2, card.getDescription());
      stmt.setObject(3, card.getCreationDate());
      stmt.setBoolean(4, card.isBlocked());
      stmt.setString(5, card.getBlockReason());
      stmt.executeUpdate();
    }
  }
}
