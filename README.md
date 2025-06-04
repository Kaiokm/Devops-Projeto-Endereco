# KaiokmDevOps

Bem-vindo ao projeto KaiokmDevOps! Este repositório apresenta uma aplicação construída com Spring Boot e MongoDB, com suporte a Docker para facilitar a configuração do ambiente de desenvolvimento. Além disso, o projeto inclui um front-end desenvolvido em React, permitindo uma experiência completa de desenvolvimento full-stack.

## Sobre o Projeto

Este projeto foi inspirado em um vídeo do YouTube, que utilizei como base para implementar o suporte ao Docker. O objetivo foi criar uma aplicação funcional e moderna, explorando boas práticas de desenvolvimento e ferramentas populares como Spring Boot, MongoDB e Docker.

## Funcionalidades

* Back-end desenvolvido com Spring Boot
* Banco de dados MongoDB
* Front-end desenvolvido com React
* Configuração e execução simplificadas usando Docker

## Pré-requisitos

Certifique-se de ter os seguintes softwares instalados na sua máquina:

* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/)
* [Node.js](https://nodejs.org/) (para o front-end)
* [Docker](https://www.docker.com/)

## Como Configurar o Projeto

### Back-end

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/kaiokmdevops.git
   cd kaiokmdevops
   ```

2. Configure as variáveis de ambiente no arquivo `application.properties` ou use um `.env` com a variável `SPRING_DATA_MONGODB_URI` para o URI do MongoDB.

3. Compile o projeto:

   ```bash
   mvn clean install
   ```

4. Execute a aplicação:

   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

### Front-end

1. Navegue até o diretório do front-end:

   ```bash
   cd frontend
   ```

```bash
   cd frontend-app
   ```

2. Instale as dependências:

   ```bash
   npm install
   ```

3. Inicie o servidor de desenvolvimento:

   ```bash
   npm start
   ```

O front-end estará disponível em: [http://localhost:3000](http://localhost:3000)

### Usando Docker

1. Certifique-se de que o Docker está instalado e em execução na sua máquina.

2. Construa e inicie os containers:

   ```bash
   docker-compose up --build
   ```

O Docker irá configurar tanto o back-end quanto o MongoDB automaticamente. O front-end deve ser iniciado manualmente usando o comando `npm start` mencionado anteriormente.

3. Para parar os containers:

   ```bash
   docker-compose down
   ```

## Estrutura do Projeto

* `src/main/java`: Código fonte do back-end
* `src/main/resources`: Arquivos de configuração
* `frontend`: Código fonte do front-end
* `Dockerfile` e `docker-compose.yml`: Configuração para Docker

## Créditos

Projeto inspirado por \Javanauta. Este projeto é uma evolução do conteúdo apresentado no vídeo, com adições e adaptações para atender aos requisitos acadêmicos.

---

Espero que este projeto seja útil para aprendizado e desenvolvimento! Caso tenha dúvidas, sinta-se à vontade para abrir uma issue ou entrar em contato.

Happy coding! 🚀
