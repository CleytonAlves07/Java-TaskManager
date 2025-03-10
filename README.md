# Task Manager - Gerenciador de Tarefas

Este é um projeto de gerenciamento de tarefas (task manager) desenvolvido em **Spring Boot** com **MySQL** como banco de dados. O sistema permite criar, selecionar e excluir boards (quadros) para organizar tarefas em colunas personalizadas.

---

## 🚀 Tecnologias Utilizadas

- **Spring Boot**: Framework Java para desenvolvimento de aplicações web.
- **MySQL**: Banco de dados relacional para armazenamento de dados.
- **Liquibase**: Ferramenta de migração de banco de dados.
- **Docker**: Para rodar o MySQL em um contêiner.
- **Gradle**: Gerenciador de dependências e build do projeto.
- **Lombok**: Para reduzir boilerplate code com anotações.

---

## 📋 Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Java 17**: JDK 17 ou superior.
- **Docker**: Para rodar o MySQL em um contêiner.
- **Gradle**: Para build e execução do projeto.
- **MySQL Client**: Opcional, para interagir com o banco de dados diretamente.

---

## 🛠️ Configuração do Projeto

### 1. Clone o Repositório
    ```bash
    git clone https://github.com/seu-usuario/taskmanager.git
    cd taskmanager

### 2. Suba o MySQL com Docker

```bash
docker compose up -d

