package com.taskmanager.taskmanager;

import com.taskmanager.taskmanager.service.BoardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TaskmanagerApplication {

	private static BoardService boardService = new BoardService();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApplication.class, args);
		runMenu();
	}

	private static void runMenu() {
		while (true) {
			System.out.println("1 - Criar novo board");
			System.out.println("2 - Selecionar board");
			System.out.println("3 - Excluir boards");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");

			if (scanner.hasNextInt()) {
				int option = scanner.nextInt();
				scanner.nextLine(); // Consumir a nova linha

				switch (option) {
					case 1:
						boardService.createBoard();
						break;
					case 2:
						boardService.selectBoard();
						break;
					case 3:
						boardService.deleteBoard();
						break;
					case 4:
						System.out.println("Saindo...");
						return;
					default:
						System.out.println("Opção inválida!");
				}
			} else {
				System.out.println("Entrada inválida! Digite um número.");
				scanner.nextLine();
			}
		}
	}
}