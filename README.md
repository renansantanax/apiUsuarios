# 🛉 API de Usuários - Spring Boot

API desenvolvida com **Spring Boot** para realizar operações de *criar* e *editar* um usuário em um sistema. Este projeto é feito com a idealização de microserviço e visa demonstrar boas práticas com Java, Spring e Docker.

---

## 🚀 Tecnologias Utilizadas

- **Java 21**
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

---

## ⚙️ Como Executar

### ▶️ Com Docker (recomendado)

```bash
git clone https://github.com/renansantanax/apiUsuarios.git
cd apiUsuarios
docker-compose up --build
```

A API estará disponível em: `http://localhost:8082`

---

## 📀 Endpoints Padrão

| Método | Rota                  | Ação                  |
|--------|-----------------------|-----------------------|
| POST   | `/usuario/criar`      | Cria um novo usuário  |
| POST   | `/usuario/autenticar` | Autentica um usuário  |

---

## 🛠️ Recursos

- ✅ Validação com `@Valid`
- ✅ Paginação e filtros
- ✅ Uso do JWT (Spring Security)
- ✅ Testes unitários com JUnit

---

> Desenvolvido com 💻 por [Renan Santana](https://github.com/renansantanax)

