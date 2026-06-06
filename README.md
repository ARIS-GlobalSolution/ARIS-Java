# ARIS - Agricultura Inteligente 🌱

## Integrantes

* Amandha Yumi Toyota Artulino - RM563549
* Erick Takeshi Andrade Nakajune - RM566509
* Giovanna Bardella Gomes - RM561439

---

## Descrição do Projeto

O ARIS (Agricultura Inteligente) é uma API REST desenvolvida em Java com Spring Boot para auxiliar no monitoramento e gerenciamento de estufas agrícolas.

A solução permite o cadastro de usuários, estufas, sensores e registros de telemetria, possibilitando o acompanhamento das condições ambientais e contribuindo para uma gestão mais eficiente da produção agrícola.

---

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Spring Validation
* Spring Security
* Swagger/OpenAPI
* Lombok
* H2 Database
* Maven
* Git e GitHub

---

## Arquitetura do Projeto

A aplicação segue o padrão de arquitetura em camadas:

* Controller
* Service
* Repository
* Entity
* DTO

Utilizando os princípios da arquitetura REST para comunicação entre cliente e servidor.

---

## Funcionalidades

### Usuários

* Cadastrar usuário
* Listar usuários
* Buscar usuário por ID
* Atualizar usuário
* Excluir usuário

### Estufas

* Cadastrar estufa
* Listar estufas
* Buscar estufa por ID
* Atualizar estufa
* Excluir estufa

### Sensores

* Cadastrar sensor
* Listar sensores
* Buscar sensor por ID
* Atualizar sensor
* Excluir sensor

### Telemetria

* Registrar dados coletados pelos sensores
* Consultar registros de telemetria

---

## Modelagem Avançada

O projeto utiliza recursos avançados de modelagem JPA:

* Relacionamentos entre entidades
* Classe Embedded (Localizacao)
* Múltiplas tabelas relacionadas
* Persistência utilizando Spring Data JPA

---

## Validações

A aplicação utiliza Bean Validation para garantir a integridade dos dados:

* @NotBlank
* @Email
* Validação automática de requisições

---

## Tratamento de Exceções

A API possui tratamento global de exceções para padronização das respostas de erro.

---

## Documentação da API

Swagger/OpenAPI:

http://localhost:8081/swagger-ui/index.html

---

## Como Executar o Projeto

### Clonar o Repositório

```bash
git clone https://github.com/ARIS-GlobalSolution/ARIS-Java.gitO
```

### Entrar na Pasta

```bash
cd aris-api
```

### Executar

```bash
mvn spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8081
```

---

## Banco de Dados H2

Console H2:

```text
http://localhost:8081/h2-console
```

Configuração padrão:

```text
JDBC URL: jdbc:h2:mem:arisdb
User: sa
Password:
```

---

## Links do Projeto

### Repositório GitHub

https://github.com/ARIS-GlobalSolution/ARIS-Java.git

### SWAGGER

http://localhost:8081/swagger-ui/index.html

### Vídeo de Apresentação

https://youtu.be/1BuaIXa2yRc

### Pitch

COLOCAR_LINK_PITCH

---

## Objetivo Acadêmico

Projeto desenvolvido para a disciplina de Java Advanced, aplicando conceitos de:

* Desenvolvimento de APIs REST
* Spring Boot
* Persistência de Dados
* Arquitetura em Camadas
* Validação de Dados
* Segurança de Aplicações
* Documentação de APIs

---


