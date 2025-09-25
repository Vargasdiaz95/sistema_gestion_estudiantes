# Sistema de Gestión de Estudiantes 🎓

Proyecto académico desarrollado en **Java (Spring Boot + Thymeleaf)** como parte de la asignatura *Gestión de Proyectos TI*.  

## 📌 Funcionalidades
- Registro de estudiantes (nombre, correo, programa).
- Gestión de notas por estudiante.
- Listado de estudiantes en interfaz web.
- Persistencia con base de datos H2 (en memoria).
- API REST para integración con otros sistemas.

## 🛠️ Requisitos
- **JDK 17+**
- **Maven 3+**
- **NetBeans / IntelliJ / Eclipse**
- **Navegador web (para acceder a la interfaz)**

## 🔗 URLs de acceso
- **Aplicación web:** 👉 http://localhost:8080/
- **API estudiantes (GET):** 👉 http://localhost:8080/estudiantes
- **API notas (GET):** 👉 http://localhost:8080/notas
- **Consola H2:** 👉 http://localhost:8080/h2-console

## 🌱 Ramas de desarrollo
- **main:** versión estable.
- **develop:** integración de nuevas funcionalidades.
- **feature/estudiantes:** desarrollo del módulo estudiantes.

## 👨‍💻 Equipo
- **Líder de proyecto:** Fabian Ricardo Vargas
- **Backend Developer:** Fabian Ricardo Vargas
- **Frontend Developer:** Fabian Ricardo Vargas
- **Tester/QA:** Fabian Ricardo Vargas

## Pruebas 🔬
> Rama feature/estudiantes: desarrollo en curso 🚧

## ▶️ Ejecución
Clona el repositorio y ejecuta:

```bash
mvn spring-boot:run
