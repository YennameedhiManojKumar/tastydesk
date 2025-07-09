# 🍽️ TastyDesk Backend

TastyDesk is a full-stack Restaurant Management System. This is the backend REST API built using **Java + Spring Boot**, following **MVC architecture**, and connected to **MySQL**.

---

## 📌 Features Implemented (Till Now)

- ✅ User registration (open endpoint)
- ✅ Secure user management with Spring Security
- ✅ RESTful CRUD API for `User` entity
- ✅ Role-based field for future admin/staff features
- ✅ MySQL integration using Spring Data JPA
- ✅ Tested using Postman

---

## 🧱 Tech Stack

| Layer            | Tech                                |
|------------------|-------------------------------------|
| Language         | Java (17+)                          |
| Framework        | Spring Boot                         |
| ORM              | Spring Data JPA (Hibernate)         |
| Security         | Spring Security                     |
| Database         | MySQL                               |
| Build Tool       | Maven                               |
| API Testing      | Postman                             |

---

## 📁 Project Structure

```
tastydesk-backend/
├── config/             # Security configuration
├── controller/         # REST APIs (UserController)
├── model/              # JPA Entities (User.java)
├── repository/         # Spring Data Repositories
├── application.properties
└── TastydeskBackendApplication.java
```

---

## 🔐 Security

- Used `SecurityFilterChain` with:
  - `csrf().disable()` for development
  - Open access to `/api/users/register`
  - All other endpoints require authentication (`.anyRequest().authenticated()`)

---

## 📌 Available Endpoints

| Method | Endpoint                  | Description               | Access      |
|--------|---------------------------|---------------------------|-------------|
| GET    | `/api/users`              | Get all users             | Secured     |
| GET    | `/api/users/{id}`         | Get user by ID            | Secured     |
| POST   | `/api/users`              | Create user               | Secured     |
| POST   | `/api/users/register`     | Register new user         | Public      |
| DELETE | `/api/users/{id}`         | Delete user               | Secured     |

---

## 🧪 Testing with Postman

- Send `POST` request to:  
  `http://localhost:8080/api/users/register`

### Example JSON Body:
```json
{
  "name": "Manoj Kumar",
  "email": "manoj@example.com",
  "password": "secure123",
  "role": "user"
}
```

---

## ⚙️ MySQL Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tastydesk
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ✅ Next Steps (Upcoming Features)

- 🔐 Login endpoint
- 🔐 JWT authentication & token-based access
- 👥 Role-based access (Admin/User)
- 📄 Swagger/OpenAPI documentation

---

## 👨‍💻 Author

**Y Manoj Kumar**  
[LinkedIn](https://www.linkedin.com/in/manojkumaryennameedhi)

