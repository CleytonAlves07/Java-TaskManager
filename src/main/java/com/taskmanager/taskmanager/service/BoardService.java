package com.taskmanager.taskmanager.service;

import com.taskmanager.taskmanager.config.DatabaseConfig;
import com.taskmanager.taskmanager.dto.BoardDTO;
import com.taskmanager.taskmanager.persistence.BoardDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardService {
  private Connection connection;
  private BoardDAO boardDAO; // Inicialize o BoardDAO

  public BoardService() {
    try {
      connection = DatabaseConfig.getConnection();
      boardDAO = new BoardDAO(connection); // Inicialize o BoardDAO com a conexão
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void createBoard() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nome do board: ");
    String name = scanner.nextLine();

    BoardDTO board = new BoardDTO();
    board.setName(name);

    try {
      boardDAO.save(board); // Agora boardDAO não será nulo
      System.out.println("Board criado com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void selectBoard() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nome do board: ");
    String name = scanner.nextLine();

    try {
      BoardDTO board = boardDAO.findByName(name);
      if (board != null) {
        System.out.println("Board selecionado: " + board.getName());
        // Implementar manipulação do board
      } else {
        System.out.println("Board não encontrado!");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void deleteBoard() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nome do board: ");
    String name = scanner.nextLine();

    try {
      boardDAO.delete(name);
      System.out.println("Board excluído com sucesso!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}