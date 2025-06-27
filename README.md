# REST API with Spring Boot

It's a simple design of a REST API to start learning how manage and work with the MVC pattern in Spring, 
it can be take as a starting point to keep learning or develop a complex project from something simple. 

## 🛠️ Technologies
- [Spring](https://spring.io/)
- [Docker](https://www.docker.com/)
- [Postman](https://www.postman.com/)

## ✨ Features
- Dependencies used Spring Web, Spring Data JPA, PostgreSQL Driver. Recommend use [Spring initializr](https://start.spring.io/) it's really useful to build an app and you can change maven or the DB driver if you rather try something else.
- Docker used the images [postgres](https://hub.docker.com/_/postgres) and [dpage/pgadmin4](https://www.pgadmin.org/docs/pgadmin4/latest/container_deployment.html) it can be changed if you rather other DB but in that case you will need to change the database driver and possibly adjust JPA configurations if switching to a NoSQL database.
- Postman it's not necesary, I like it to test APIs but it can be change for any other software or method.

## 🚀 Installation

1. Clone repository

```console
git clone https://github.com/Hecgarx2/spring-rest-api.git
cd spring-rest-api
```

2. Run container
As it was mentioned before this container get DB Postgres and pgAdmin to manage the data. 
```console
docker-compose up -d
docker container ls
```
With that the containers are running, you can go to [http://localhost:8081/](http://localhost:8081/) and use pgAdmin with data in `docker-compose.yml`, you can change the credentials or database name if you want.

3. Run Backend
```console
mvn clean install
mvn spring-boot:run
```
With that you installed all the dependencies in the project and you can start testing the API with Postman or go to [http://localhost:8080/todos](http://localhost:8080/todos) and check the GET method.

## 📌 Endpoints

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| GET    | `/todos`      | List all todos    |
| POST   | `/todos`      | Create a new todo |
| PUT    | `/todos/`     | Update a todo     |
| DELETE | `/todos/{id}` | Delete a todo     |

## 🧪 API Testing with Postman

If you decided use Postman here you can see how test the API without issues

#### 📝 POST `/todos`
**Request**
```json
{
  "description": "Practice Postman",
  "completed": false
}
```
**Response**
```json
{
  "id": 1,
  "description": "Practice Postman",
  "completed": false
}
```

#### ✅ GET `/todos`
**Request** <br>
Don't body required
URL: `http://localhost:8080/todos/`<br>
**Response**
```json
[
  {
    "id": 1,
    "description": "Practice Postman",
    "completed": false
  }
]
```

#### ✏️ PUT `/todos`
**Request**
```json
{
  "id": 1,
  "description": "Learn and Practice Postman",
  "completed": true
}
```
**Response**
```json
{
  "id": 1,
  "description": "Learn and Practice Postman",
  "completed": true
}
```

#### ❌ DELETE `/todos/{id}`
**Request**<br>
Don't body required
URL: `http://localhost:8080/todos/1`  <br>
**Response**<br>
`200 OK` (No custom response body implemented yet)

## 👨‍💻 Author
Hector Garcia

GitHub: [@Hecgarx2](https://github.com/Hecgarx2)

Linkdin: [Hector Garcia](www.linkedin.com/in/hector-garcia-garcia)
