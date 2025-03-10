package com.taskmanager.taskmanager.persistence;

import com.taskmanager.taskmanager.dto.BoardDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
  private Connection connection;

  public BoardDAO(Connection connection) {
    this.connection = connection;
  }

  public void save(BoardDTO board) throws SQLException {
    String sql = "INSERT INTO boards (name) VALUES (?)";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, board.getName());
      stmt.executeUpdate();
    }
  }

  public BoardDTO findByName(String name) throws SQLException {
    String sql = "SELECT * FROM boards WHERE name = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, name);
      ResultSet rs = stmt.executeQuery();
      if (rs.next()) {
        BoardDTO board = new BoardDTO();
        board.setName(rs.getString("name"));
        return board;
      }
    }
    return null;
  }

  public void delete(String name) throws SQLException {
    String sql = "DELETE FROM boards WHERE name = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      stmt.setString(1, name);
      stmt.executeUpdate();
    }
  }
}