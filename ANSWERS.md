# Questions to be answered as part of your submission

1. Write a brief summary (2-3 sentences) describing the purpose of the `Book` class and how it is represented in the database.
>The Book class defines a book object and basically acts as a database schema for the books. The book class also defines a book object that can live in memory while the application is live. 
2. List at least three methods inherited from `CrudRepository` that the `BookRepository` can use, and describe their use.
>findById(ID id), findAll(), deleteByID(ID id)
3. Describe the purpose of each method in the BookController class.
   Explain the role of annotations like `@Controller`, `@Autowired`, `@GetMapping`, and `@PostMapping`.
>addBook saves a book to the book repository (database), showBookList will return all books in the database. @controller is used to define the class a controller within the spring structure, equivalent to an API. @Autowired is used to inject the BookRepository. @GetMapping and @PostMapping map http requests to their respective controller methods  




