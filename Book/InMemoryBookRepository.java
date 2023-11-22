package UnitTestHW4.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository  {
    private final Map<String, Book> books;
// Частное поле типа "Map<String, Book>", представляет коллекцию книг в виде отображения (ключ-значение). 
// Ключом является идентификатор книги, а значением - объект типа "Book".

    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Book1", "Author1"));
        books.put("2", new Book("2", "Book2", "Author2"));
    }

    @Override
    public Book findById(String id) {
        return books.get(id);
    }
// "findById(String id)": Этот метод принимает идентификатор книги в качестве параметра и возвращает книгу из отображения 
// "books" по соответствующему ключу.


    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
// "findAll()": Этот метод возвращает список всех книг, содержащихся в отображении "books".
}