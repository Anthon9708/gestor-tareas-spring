# 📋 Gestor de Tareas (Task Manager API)

Este es un proyecto Full-Stack desarrollado para demostrar mis habilidades en el backend usando **Java y Spring Boot**, junto con un frontend ligero usando **Vanilla JavaScript**.

El objetivo principal de esta aplicación es implementar un **CRUD completo** (Crear, Leer, Actualizar, Borrar) y entender la comunicación Cliente-Servidor a través de una API REST.

## 🛠️ Tecnologías Utilizadas

* **Backend:** Java 21, Spring Boot 3
* **Base de Datos:** H2 Database (In-Memory)
* **ORM:** Spring Data JPA / Hibernate
* **Frontend:** HTML5, CSS3, Vanilla JavaScript (Fetch API)
* **Herramientas:** Maven, Git

## 🚀 Características

* **API RESTful:** Endpoints estructurados para gestionar recursos.
* **Despliegue integrado:** El frontend se sirve estáticamente desde el propio servidor de Spring Boot (evitando problemas de CORS).
* **Gestión de estado:** Las tareas se pueden crear, listar, marcar como completadas/pendientes y eliminar.

## ⚙️ Cómo ejecutar este proyecto en tu máquina

Si quieres probar este proyecto localmente, sigue estos pasos:

1. Clona este repositorio:
   ```bash
   git clone https://github.com/TU-USUARIO/gestor-tareas-spring.git

*(Asegúrate de cambiar `TU-USUARIO` en el enlace de git clone por tu usuario real de GitHub).*

2. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, VSCode).

3. Deja que Maven descargue las dependencias automáticamente.

4. Ejecuta la clase principal GestorTareasApplication.java.

5. Abre tu navegador y navega a: http://localhost:8080

**Nota**: Para ver la base de datos H2 en tiempo real, puedes acceder a http://localhost:8080/h2-console (URL JDBC: jdbc:h2:mem:testdb).


## 🧠 Lo que he aprendido con este proyecto ##
* Configuración inicial de un proyecto Spring Boot con Spring Initializr.

* Inyección de dependencias y arquitectura por capas (Controller, Model, Repository).

* Mapeo de entidades a la base de datos usando anotaciones @Entity, @Id, etc.

* Consumo de APIs desde el cliente usando funciones asíncronas y Promesas en JavaScript.


