
# 💳 Desafio Banco - Spring Boot API

Este projeto é uma API REST desenvolvida com **Spring Boot** que simula uma **conta bancária**, permitindo **criar** e **consultar usuários por ID**. Ele foi construído como parte de um desafio técnico e utiliza banco de dados **H2 em memória**, com acesso ao **Swagger UI** para documentação da API.

---

## 🚀 Funcionalidades

- ✅ Criar um novo usuário com conta bancária.
- ✅ Buscar um usuário pelo seu ID.
- ✅ Validação de número da conta (não permite duplicados).
- ✅ Acesso ao banco H2 via console.
- ✅ Documentação interativa com Swagger UI.

---

## 📦 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- OpenAPI / Swagger
- Groovy

---

## 📁 Estrutura de Pastas

```bash
src/
├── main/
│   ├── java/
│   │   └── com.dio.desafio_banco/
│   │       ├── controller/
│   │       ├── domain/
│   │       │   ├── model/
│   │       │   └── repository/
│   │       ├── service/
│   │       └── exception/
│   └── resources/
│       ├── application.properties

```

⸻

🛠 Como rodar o projeto
	1.	Clone o repositório:

git clone https://github.com/seu-usuario/seu-repo.git
cd seu-repo

	2.	Abra o projeto no IntelliJ ou VS Code com suporte ao Spring Boot.
	3.	Execute a aplicação:

./mvnw spring-boot:run

ou pelo IntelliJ clicando no botão de “run” da classe DesafioBancoApplication.java.

⸻

🗄️ Console H2

O projeto utiliza banco H2 em memória, acessível via navegador:
	•	URL: http://localhost:8080/h2-console
	•	JDBC URL: jdbc:h2:mem:sdw2023
	•	User: sdw2023
	•	Password: (em branco)

	Se der erro de conexão, verifique se a aplicação está rodando e os dados do application.properties estão corretos.

⸻

📖 Swagger - Documentação da API

A documentação da API está disponível no Swagger UI:
	•	👉 http://localhost:8080/swagger.html

⸻

🔍 Exemplos de Requisições

✅ Criar um usuário

POST /users

{
  "name": "Teste",
  "account": {
    "number": "001",
    "agency": "00001",
    "balance": 10,
    "limit": 200
  },
  "card": {
    "number": "11",
    "limit": 100
  },
  "features": [
  {
      "icon": "star",
      "description": "Destaque"
    }
  ],
  "news": [
    {
      "icon": "alert",
      "description": "atenção"
    }
  ]
}

🔍 Consultar usuário por ID

GET /users/{id}

⸻

⚠️ Regras de negócio
	•	Não é permitido cadastrar duas contas com o mesmo número.
	•	O ID do usuário deve ser único e gerado automaticamente.
	•	Requisições inválidas retornam erro 400 Bad Request.

⸻

📌 Observações
	•	O banco de dados é resetado toda vez que a aplicação é reiniciada (por ser H2 em memória).
	•	Recomendado utilizar o Swagger para testar os endpoints.

⸻

👨‍💻 Autor

Desenvolvido por Natan Vilas Boas.
