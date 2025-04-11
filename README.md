# 🛉 API de Usuários - Spring Boot

API RESTful desenvolvida com **Spring Boot** para realizar operações CRUD em um sistema de usuários. Este projeto faz parte de uma arquitetura modular e visa demonstrar boas práticas com Java, Spring e Docker.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3+**
- **Spring Data JPA**
- **Docker & Docker Compose**
- **Maven**
- **PostgreSQL** (configurável via `docker-compose.yml`)

---

## 📁 Estrutura do Projeto

```
apiUsuarios/
├── src/
│   └── main/
│       ├── java/           # Código fonte (controladores, serviços, entidades, repositórios)
│       └── resources/      # Configurações, application.properties
├── docker-compose.yml      # Contêiner da aplicação + banco
├── pom.xml                 # Dependências e build
└── mvnw                    # Wrapper Maven
```

---

## 🧠 Boas Práticas Aplicadas

### ✅ Princípios SOLID

- **S**ingle Responsibility: cada classe tem uma responsabilidade clara.
- **O**pen/Closed: a estrutura permite novas funcionalidades sem alterar o código base.
- **L**iskov Substitution: os contratos das interfaces são respeitados.
- **I**nterface Segregation: interfaces específicas para o necessário.
- **D**ependency Inversion: uso de injeção de dependência via Spring.

### ✅ Design Patterns

- **Repository Pattern**: abstração de acesso a dados com Spring Data JPA.
- **Service Layer**: encapsula a lógica de negócios.
- **DTO Pattern** (sugestão futura): ideal para desacoplar entidades da API pública.

---

## ⚙️ Como Executar

### ▶️ Com Docker (recomendado)

```bash
git clone https://github.com/renansantanax/apiUsuarios.git
cd apiUsuarios
docker-compose up --build
```

A API estará disponível em: `http://localhost:8080`

### ▶️ Manualmente (Java + Maven)

```bash
./mvnw spring-boot:run
```

---

## 📀 Endpoints Padrão

| Método | Rota             | Ação                  |
|--------|------------------|-----------------------|
| GET    | `/usuarios`      | Lista todos os usuários |
| GET    | `/usuarios/{id}` | Busca usuário por ID   |
| POST   | `/usuarios`      | Cria um novo usuário   |
| PUT    | `/usuarios/{id}` | Atualiza dados         |
| DELETE | `/usuarios/{id}` | Remove um usuário      |

---

## 🛠️ Futuras Melhorias

- ✅ Validação com `@Valid`
- ✅ Paginação e filtros
- ⏳ Segurança com JWT (Spring Security)
- ⏳ Testes unitários com JUnit/Mockito
- ⏳ Integração com API Gateway (em arquitetura maior)

---

## 🤝 Contribuindo

1. Fork este repositório
2. Crie sua feature branch: `git checkout -b minha-feature`
3. Commit suas mudanças: `git commit -m 'feat: nova funcionalidade'`
4. Push para a branch: `git push origin minha-feature`
5. Abra um Pull Request 🦘

---

## 📝 Licença

Distribuído sob a licença MIT. Veja [LICENSE](LICENSE) para mais informações.

---

> Desenvolvido com 💻 por [Renan Santana](https://github.com/renansantanax)

