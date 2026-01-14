# 🚀 Java Spring Professional

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)

Repositório dedicado ao curso **Java Spring Professional** da [DevSuperior](https://devsuperior.com.br), ministrado pelo professor **Nélio Alves**. Este curso aborda conceitos avançados de desenvolvimento backend com Spring Boot, desde fundamentos até implantação em produção.

<img width="1024" height="461" alt="Banner do Curso Java Spring Professional" src="https://github.com/user-attachments/assets/17205a62-9646-4299-b6be-b7a306383c97" />

## 📋 Sobre o Curso

O **Java Spring Professional** é um curso completo que prepara desenvolvedores para criar aplicações robustas, escaláveis e profissionais utilizando o ecossistema Spring. Através de uma abordagem prática e baseada em projetos reais, o curso cobre desde os fundamentos até tópicos avançados como segurança, implantação e CI/CD.

**Link do curso:** [DevSuperior - Java Spring Professional](https://devsuperior.com.br/)

## 🎯 Objetivos

- Dominar o ecossistema Spring e Spring Boot
- Implementar APIs RESTful seguindo as melhores práticas
- Aplicar conceitos de Domain-Driven Design (DDD)
- Implementar segurança com OAuth2 e JWT
- Configurar ambientes de desenvolvimento, homologação e produção
- Implementar pipelines de CI/CD para deploy automatizado

## 📚 Ementa do Curso

### 1. **Fundamentos do Spring**
- Components e Injeção de Dependência
- Estrutura de projeto em camadas
- Configuração e profiles

### 2. **Modelo de Domínio e ORM**
- Modelagem de domínio rica
- Relacionamentos entre entidades
- Mapeamento objeto-relacional com JPA/Hibernate
- Anotações e estratégias de mapeamento

### 3. **API REST e Boas Práticas**
- Implementação de endpoints RESTful
- Padrão DTO (Data Transfer Object)
- Tratamento de exceções global
- Validação de dados com Bean Validation
- Paginação e ordenação

### 4. **Persistência de Dados**
- Consultas ao banco de dados
- JPQL e SQL nativo
- Spring Data JPA repositories
- Transações e controle concorrencial

### 5. **Segurança e Autenticação**
- Controle de acesso e autorização
- Implementação de login
- OAuth2 e fluxos de autenticação
- JSON Web Tokens (JWT)
- Segurança em APIs REST

### 6. **Implantação e DevOps**
- Variáveis de ambiente e configuração
- Perfis de projeto (dev, test, prod)
- Ambiente local e homologação
- CI/CD com GitHub Actions
- Deploy em nuvem

## 🏗️ Estrutura do Repositório

\```
ds-java-spring-professional/
├── desafios/              # Soluções dos desafios propostos
│   ├── Desafio01/        # Componentes e Injeção de Dependência
│   ├── Desafio02/        # Modelo de domínio e ORM
│   ├── Desafio03/        # CRUD de clientes
│   ├── Desafio04/        # Consulta vendas
│   └── Desafio05/        # Projeto Spring Boot estruturado
├── dscommerce/           # Projeto guiado completo (E-commerce)
├── docs/                 # Documentação adicional
└── README.md             # Este arquivo
\```

## ✅ Desafios e Projetos

### **Desafios Concluídos**

| Desafio | Tema | Status | Link |
|---------|------|--------|------|
| **01** | Componentes e Injeção de Dependência | ✅ Concluído | [Ver código](desafios/Desafio01) |
| **02** | Modelo de domínio e ORM | ✅ Concluído | [Ver código](desafios/Desafio02) |
| **03** | CRUD de clientes | ✅ Concluído | [Ver código](desafios/Desafio03) |
| **04** | Consulta vendas | ✅ Concluído | [Ver código](desafios/Desafio04) |
| **05** | Projeto Spring Boot estruturado | ✅ Concluído | [Ver código](desafios/Desafio05) |

### **Projeto Principal**
- **dscommerce**: Projeto guiado completo que aplica todos os conceitos do curso
    - E-commerce completo com produtos, categorias, pedidos e pagamentos
    - Autenticação e autorização com OAuth2
    - API RESTful documentada
    - Testes unitários e de integração
    - Pipeline de CI/CD configurado

## 🛠️ Tecnologias Utilizadas

### Backend
- **Java 17+** - Linguagem de programação principal
- **Spring Boot 3.x** - Framework principal para desenvolvimento
- **Spring Data JPA** - Persistência de dados com JPA
- **Spring Security** - Autenticação e autorização
- **Spring OAuth2** - Autenticação OAuth2
- **Spring Validation** - Validação de dados
- **Maven** - Gerenciamento de dependências

### Banco de Dados
- **PostgreSQL** - Banco de dados relacional principal
- **H2 Database** - Banco em memória para testes
- **Flyway** - Migração de banco de dados

### Ferramentas e Bibliotecas
- **JUnit 5** - Testes unitários
- **Mockito** - Mocking para testes
- **Lombok** - Redução de boilerplate code
- **MapStruct** - Mapeamento entre objetos
- **OpenAPI/Swagger** - Documentação de API
- **Docker** - Containerização
- **GitHub Actions** - CI/CD
- **SonarQube** - Análise estática de código

## 🚀 Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **JDK 17 ou superior** - [Download JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Maven 3.8+** - [Download Maven](https://maven.apache.org/download.cgi)
- **PostgreSQL 12+** - [Download PostgreSQL](https://www.postgresql.org/download/)
- **Git** - [Download Git](https://git-scm.com/downloads)
- **Docker (opcional)** - [Download Docker](https://www.docker.com/products/docker-desktop/)

## ⚙️ Como Executar os Projetos

### Configuração do Ambiente

1. **Clone o repositório:**
   \```bash
   git clone https://github.com/andredeomondes/ds-java-spring-professional.git
   cd ds-java-spring-professional
   \```

2. **Configure o banco de dados:**
   \```bash
   # Crie um banco PostgreSQL
   createdb dscommerce

   # Ou use Docker para criar o banco
   docker run --name postgres-ds -e POSTGRES_PASSWORD=secret -p 5432:5432 -d postgres
   \```

3. **Configure as variáveis de ambiente:**
   \```bash
   # Linux/Mac
   export DB_URL=jdbc:postgresql://localhost:5432/dscommerce
   export DB_USERNAME=postgres
   export DB_PASSWORD=secret
   export JWT_SECRET=your-jwt-secret-key-here-minimum-256-bits

   # Windows (PowerShell)
   $env:DB_URL = "jdbc:postgresql://localhost:5432/dscommerce"
   $env:DB_USERNAME = "postgres"
   $env:DB_PASSWORD = "secret"
   $env:JWT_SECRET = "your-jwt-secret-key-here-minimum-256-bits"
   \```

4. **Execute o projeto:**
   \```bash
   # Navegue até o projeto desejado
   cd desafios/Desafio01

   # Execute com Maven
   mvn spring-boot:run

   # Ou compile e execute
   mvn clean install
   mvn spring-boot:run
   \```

5. **Acesse a aplicação:**
    - API REST: `http://localhost:8080`
    - Swagger UI: `http://localhost:8080/swagger-ui.html`
    - H2 Console (se aplicável): `http://localhost:8080/h2-console`
    - Actuator Endpoints: `http://localhost:8080/actuator/health`

## 📖 Funcionalidades Principais

### 🔧 Arquitetura em Camadas
\```java
Controller → Service → Repository → Database
       ↓         ↓          ↓
      DTO     Business    Entity
               Logic
\```

### 🔒 Sistema de Autenticação e Autorização
- **Autenticação JWT** - Tokens stateless com expiração configurável
- **Controle de Acesso Baseado em Roles (RBAC)** - ADMIN, CLIENT, OPERATOR
- **Proteção CSRF** - Proteção contra Cross-Site Request Forgery
- **Configuração CORS** - Controle de acesso entre origens
- **Senhas Criptografadas** - BCrypt para hash de senhas

### 📊 Persistência de Dados
- **Mapeamento ORM** - Relacionamentos @OneToMany, @ManyToOne, @ManyToMany
- **Consultas JPQL** - Query Language para operações complexas
- **Transações ACID** - Controle de concorrência e consistência
- **Migrações** - Versionamento de esquema com Flyway

### 🧪 Testes
- **Testes Unitários** - JUnit 5 com Mockito
- **Testes de Integração** - @SpringBootTest com contexto completo
- **Testes de API** - @WebMvcTest para controllers
- **Cobertura de Código** - Jacoco para relatórios de cobertura

### 🚢 CI/CD
- **GitHub Actions** - Pipeline automatizado
- **Build Automático** - Compilação e empacotamento
- **Testes Automáticos** - Execução de suite de testes
- **Análise de Qualidade** - SonarQube integration
- **Deploy Automático** - Para ambientes de staging/production

## 🧪 Executando Testes

\```bash
# Executar todos os testes
mvn test

# Executar testes de integração
mvn verify -P integration-test

# Executar testes com cobertura
mvn test jacoco:report
# Relatório disponível em: target/site/jacoco/index.html

# Executar testes específicos
mvn test -Dtest=NomeDaClasseDeTeste

# Executar com perfil de teste
mvn test -Dspring.profiles.active=test
\```

## 🔧 Configuração Docker

### Docker Compose para Ambiente Completo
\```yaml
# docker-compose.yml
version: '3.8'
services:
postgres:
image: postgres:15
environment:
POSTGRES_DB: dscommerce
POSTGRES_USER: postgres
POSTGRES_PASSWORD: secret
ports:
- "5432:5432"
volumes:
- postgres_data:/var/lib/postgresql/data

app:
build: .
depends_on:
- postgres
environment:
DB_URL: jdbc:postgresql://postgres:5432/dscommerce
DB_USERNAME: postgres
DB_PASSWORD: secret
ports:
- "8080:8080"
volumes:
- .:/app

volumes:
postgres_data:
\```

### Build da Imagem Docker
\```bash
# Construir imagem
docker build -t ds-java-spring-app .

# Executar container
docker run -p 8080:8080 \
-e DB_URL=jdbc:postgresql://host.docker.internal:5432/dscommerce \
-e DB_USERNAME=postgres \
-e DB_PASSWORD=secret \
ds-java-spring-app
\```

## 🌐 Deploy em Produção

### Ambiente de Produção Recomendado
- **Runtime**: Java 17 em container Docker
- **Banco de Dados**: PostgreSQL com replicação master-slave
- **Cache**: Redis para sessões e cache de consultas
- **Load Balancer**: Nginx ou AWS ALB
- **Monitoramento**: Prometheus + Grafana
- **Logs**: ELK Stack (Elasticsearch, Logstash, Kibana) ou Cloud Logging
- **Container Registry**: Docker Hub, AWS ECR ou Google Container Registry

### Variáveis de Ambiente de Produção
\```bash
# Configurações críticas
export DB_URL=jdbc:postgresql://production-db:5432/dscommerce_prod
export DB_USERNAME=prod_user
export DB_PASSWORD=${DB_PASSWORD_SECRET}
export JWT_SECRET=${JWT_SECRET_KEY}
export JWT_EXPIRATION=86400000

# Configurações de segurança
export CORS_ALLOWED_ORIGINS=https://seusite.com,https://app.seusite.com
export SECURITY_REQUIRE_SSL=true

# Configurações de performance
export SERVER_TOMCAT_MAX_THREADS=200
export SPRING_DATASOURCE_HIKARI_MAXIMUM_POOL_SIZE=20
\```

## 📈 Progresso do Curso

- [x] **Módulo 1: Fundamentos do Spring** - Componentes, DI, Configuração
- [x] **Módulo 2: Modelo de Domínio e ORM** - Entidades, Relacionamentos, JPA
- [x] **Módulo 3: API REST e Boas Práticas** - Controllers, DTOs, Validação
- [x] **Módulo 4: Persistência Avançada** - Consultas JPQL, Transações
- [x] **Módulo 5: Segurança** - OAuth2, JWT, Controle de Acesso
- [x] **Módulo 6: Implantação e DevOps** - CI/CD, Docker, Deploy

## 🤝 Contribuindo

Este repositório é pessoal e contém minhas soluções para os exercícios do curso. No entanto, sugestões de melhorias são sempre bem-vindas!

1. **Fork o projeto**
2. **Crie uma branch para sua feature** (`git checkout -b feature/AmazingFeature`)
3. **Commit suas mudanças** (`git commit -m 'Add some AmazingFeature'`)
4. **Push para a branch** (`git push origin feature/AmazingFeature`)
5. **Abra um Pull Request**

### Padrões de Commit
- `feat:` Nova funcionalidade
- `fix:` Correção de bug
- `docs:` Documentação
- `style:` Formatação, pontuação, etc
- `refactor:` Refatoração de código
- `test:` Adição ou correção de testes
- `chore:` Atualização de build, configurações, etc

## 📄 Licença

Este projeto é para fins educacionais como parte do curso Java Spring Professional da DevSuperior. O conteúdo do curso é propriedade intelectual da DevSuperior.

## ⚠️ Aviso Legal

Este repositório contém implementações de exercícios e projetos desenvolvidos durante o curso. O material é destinado para estudo e referência pessoal. Respeite os direitos autorais da DevSuperior e do professor Nélio Alves.

## 🙏 Agradecimentos

- **Professor Nélio Alves** - Por compartilhar conhecimento de forma didática e prática
- **DevSuperior** - Por oferecer cursos de alta qualidade para a comunidade de desenvolvedores
- **Comunidade Java/Spring** - Pelo ecossistema robusto e documentação excelente
- **Todos os contribuidores do Spring Framework** - Por manterem um projeto open-source excepcional

## 📞 Contato

**André de Oliveira**
- GitHub: [@andredeomondes](https://github.com/andredeomondes)
- LinkedIn: [André de Oliveira](https://linkedin.com/in/andredeoliveira)
- Email: andredeomondes@example.com

## 🔗 Links Úteis

- [Documentação Oficial Spring Boot](https://spring.io/projects/spring-boot)
- [Documentação Spring Security](https://spring.io/projects/spring-security)
- [Guia JPA com Hibernate](https://docs.jboss.org/hibernate/orm/current/userguide/html_single/Hibernate_User_Guide.html)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [Docker Documentation](https://docs.docker.com/)

---

<div align="center">
  <p>Desenvolvido com 💚 durante o curso Java Spring Professional</p>
  <p>Visite a <a href="https://devsuperior.com.br">DevSuperior</a> para mais cursos incríveis!</p>

<sub>Última atualização: Janeiro 2024 | Java 17 | Spring Boot 3.x</sub>
</div>