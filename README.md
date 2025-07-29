# ForoHub-ChallengeAlura-Backend
Proyecto backend desarrollado como parte del **Challenge de Alura Latam**. Esta API gestiona la publicación, actualización y administración de tópicos (temas de discusión) en un foro de desarrollo.

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Flyway (para migraciones de base de datos)
- JWT (JSON Web Tokens) para autenticación
- Maven

## 🛠️ Configuración local

1. Clona el repositorio:
git clone https://github.com/Yeison-Micolta-R/ForoHub-ChallengeAlura-Backend.git

2. Crea una base de datos MySQL:
CREATE DATABASE forohub;

3. Configura las credenciales en `src/main/resources/application.properties`:
spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

4. Ejecuta el proyecto desde tu IDE o terminal:
./mvnw spring-boot:run

## 🔐 Autenticación

- Inicio de sesión con usuario y contraseña.
- Se genera un token JWT que debe incluirse en los headers de las peticiones protegidas:
Authorization: Bearer <token>

## 📄 Endpoints principales

| Método | Endpoint         | Descripción                    |
|--------|------------------|--------------------------------|
| POST   | /login           | Autenticación de usuarios      |
| GET    | /topicos         | Listar todos los tópicos       |
| POST   | /topicos         | Crear nuevo tópico             |
| PUT    | /topicos         | Actualizar un tópico existente |
| DELETE | /topicos/{id}    | Eliminar tópico por ID         |

## ✅ Estado del proyecto
completado

## 🧑‍💻 Autor

**Yeison Micolta R.**  
[LinkedIn](https://www.linkedin.com/in/ymicoltar) | [GitHub](https://github.com/Yeison-Micolta-R)
