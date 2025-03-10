package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.dto.TaskCardDTO;
import com.taskmanager.taskmanager.persistence.TaskCardDAO;

import java.sql.Connection;
import java.time.LocalDateTime;

public class TaskCardService {
  private Connection connection;

  public TaskCardService(Connection connection) {
    this.connection = connection;
  }

  public void createTaskCard(String title, String description) {
    TaskCardDTO card = new TaskCardDTO();
    card.setTitle(title);
    card.setDescription(description);
    card.setCreationDate(LocalDateTime.now());
    card.setBlocked(false);

    TaskCardDAO cardDAO = new TaskCardDAO(connection);
    try {
      cardDAO.save(card);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
