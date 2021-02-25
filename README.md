# Grading-Application - Back End
Spring Boot application to manage student marks for assignments

### Requirements

#### Technology stack & other libraries

* JDK 1.8
* Spring Boot - Used to develop the api with fewer configurations and focus more on the business logic. And easy to handle crosscutting. Easy to manage dependency injection and provides spring data JPA to communicate with the database using ORM mapping.
* Maven - Project Management Tool(easy to handle dependencies)
* Database - MySQL
* Authentication - JWT with Spring Security

#### Libraries and Plugins

* Lombok - Never write another getter or equals method again, with one annotation a class has a fully-featured builder, Automate the logging variables, and much more.

#### External Tools & Services

* Postman - API Development Environment (Testing Documentation)

### How to bootstrap this API
There are several ways to run a Spring Boot application on your local machine.

* One way is to execute the main method in the lk.company.notesmanagementAPI.NotesManagementApplication class from your IDE.

* Alternatively you can use the Spring Boot Maven plugin like so:
```
mvn spring-boot:run
```
In the application.properties file mysql username and password should be replaced with your username and password

Then automatically spring data jpa will create the database called "gradingApp" having 9 table.

Then use the gradingApplicationDB.sql file to add the data. Also you can use the data.sql file inside the resource folder.

#### Use these two users to check the application

*Student -: username - kamal12  &  password - kamal                   
*Teacher -: username - chamari12  &  password -chamari



## Assumptions

* One class has one teacher.
* Teacher can give multiple assignments but only for her class.
* Student will be given a grade (A, B, C like that) for every assignment
* Teacher will see overall statistics for every question.


#### Table structure

![image info](./gradingAppDB.png)

# All details about API Endpoints

## User API

### 1. user signin

URL: /api/v1/users/signin

Http method: POST

Data Params: the body should be:

```json
"username:"kamal12",
"password:"kamal"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": {
        "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyNDcyNDcsImV4cCI6MTYxNDI4MzI0N30.9Zn35o_82YjdGFB4PUVJ5Me7Dw2eiTXy0PpPaF2Upik",
        "username": "chamari12",
        "roles": [
            "TEACHER"
        ]
    }
}
```
## Student API

### 1. Search Student

URL: /api/v1/students/username

Http method: GET

Data Params: the headers should be:


```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": {
        "id": "S001",
        "name": "Kamal",
        "className": "Class_A",
        "teacher": "Chamari",
        "teacherId": "T001"
    }
}
```
### 2. Get student marks

URL: /api/v1/students/studentId/asmntId/qNo

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": {
        "studentId": "S001",
        "answer": "7",
        "noOfAttempts": 2,
        "result": "wrong",
        "spentTime": "00:10:10"
    }
}
```
## Teacher API

### 1. Search Teacher

URL: /api/v1/teachers/username

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": {
        "id": "T001",
        "name": "Chamari",
        "assignedClass": "Class_A"
    }
}
```
### 2. Get overall marks of students for an assignment

URL: /api/v1/teachers/asmntId/qNo

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": {
        "avgTime": "00:07:10",
        "rightCount": 2,
        "wrongCount": 1,
        "partialCount": 0,
        "studentMarks": [
            {
                "studentId": "S001",
                "answer": "7",
                "noOfAttempts": 2,
                "result": "wrong",
                "spentTime": "00:10:10"
            },
            {
                "studentId": "S002",
                "answer": "8",
                "noOfAttempts": 1,
                "result": "right",
                "spentTime": "00:06:10"
            },
            {
                "studentId": "S003",
                "answer": "8",
                "noOfAttempts": 1,
                "result": "right",
                "spentTime": "00:05:10"
            }
        ]
    }
}
```
## Assignment API

### 1. Get all assignments according to teacher

URL: /api/v1/assignments/teacherId

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": [
        {
            "asmntId": "AS001",
            "asmntName": "Java Assingment",
            "asmntType": "online"
        },
        {
            "asmntId": "AS002",
            "asmntName": "OOP Assingment",
            "asmntType": "online"
        },
        {
            "asmntId": "AS003",
            "asmntName": "Maths Assingment",
            "asmntType": "paper"
        }
    ]
}
```

### 2. Get all questions of an assignment


URL: /api/v1/assignments/questions/asmntId

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": [
        {
            "questionPK": {
                "asmntId": "AS001",
                "qno": 1
            },
            "question": "no of primitive data types in java?",
            "answer": "8"
        },
        {
            "questionPK": {
                "asmntId": "AS001",
                "qno": 2
            },
            "question": "Access modifiers in java?",
            "answer": "public, protected, default, private"
        }
    ]
}
```
### 3. Get overall grades for students


URL: /api/v1/assignments/grades/asmntId

Http method: GET

Data Params: the headers should be:

```json
Authorization : "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjaGFtYXJpMTIiLCJpYXQiOjE2MTQyMjc5MzEsImV4cCI6MTYxNDI2MzkzMX0.eqMNf2SfaqMTPeXSy8Qsfzpt8Zs9FhkbQQ5szlgCUfE"
```
Success Response:

```json
{
    "code": 200,
    "message": "true",
    "data": [
        {
            "studentId": "S001",
            "grade": "A"
        },
        {
            "studentId": "S002",
            "grade": "B"
        },
        {
            "studentId": "S003",
            "grade": "A"
        }
    ]
}
```








