# Spring Boot MVC Lab Exercise
Welcome to the Spring Boot MVC lab exercise! In this lab, you will gain hands-on experience with the Model-View-Controller (MVC) architecture by developing a simple web application to manage a list of books. This application will allow users to perform CRUD (Create, Read, Update, Delete) operations on books.

## Objectives
By the end of this lab, you should be able to:

- Understand the MVC architecture and its components. 
- Use Spring Boot to create a simple web application. 
- Perform CRUD operations in a Spring MVC application. 
- Connect your application to an in-memory H2 database. 
- Utilize Thymeleaf to create dynamic HTML views.

## Getting Started
1. Clone this repository to your local machine using Git. 
2. Open the project in your preferred IDE (e.g., VS Code, IntelliJ IDEA, Eclipse).
3. Ensure you have Java JDK 11 or newer installed and configured correctly in your IDE.
4. Run the application as a Spring Boot App.
5. Visit http://localhost:8080 in your browser to see the application running.

### Tasks
Your tasks for this lab are divided into the following sections:

#### Task 1: Explore the Starter Code
Familiarize yourself with the provided project structure and the existing 
code. Pay special attention to the `Book` model, the repository interface, and the controller methods.

#### Task 2: Implement CRUD Operations
1. _**C**reate a New Book_: Implement the functionality to add a new book to the database. You will need to modify both the controller and the view.

2. _**R**ead/Display Books_: Ensure the application can display a list of all books stored in the database on the homepage.

3. _**U**pdate a Book_: Implement the functionality to update an existing book's details.

4. _**D**elete a Book_: Allow users to delete a book from the list.

#### Task 3: Implement the View Layer
1. Use Thymeleaf in your HTML files to display data dynamically.

2. Create forms for adding and updating book information.

3. Ensure your application is navigable and user-friendly.

#### Task 4: Test Your Application
1. Test each of the CRUD operations to ensure they work as expected.

2. Check that all data manipulations are correctly persisted in the H2 database.

## Submission
After completing the lab exercise, commit your changes and push them to your repository.
## Need Help?
If you encounter any issues or have questions, please reach out to your instructor or teaching assistants.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.3/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
