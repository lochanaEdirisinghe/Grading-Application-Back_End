# Grading-Application - Back End
Spring Boot application to manage student marks for assignments

### Requirements

#### Technology stack & other libraries

* JDK 1.8
* Spring Boot - Used to develop the api with fewer configurations and focus more on the business logic. And easy to handle crosscutting. Easy to manage dependency injection and provides spring data JPA to communicate with the database using ORM mapping.
* Maven - Project Management Tool(easy to handle dependencies)
* Database - MySQL

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
Then automatically spring data jpa will create the database called "gradingApp" having 9 table.

#### Table structure

