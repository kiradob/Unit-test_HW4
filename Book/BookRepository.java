package UnitTestHW4.Book;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}

// "findById(String id)": Этот метод принимает идентификатор книги в качестве параметра и возвращает объект типа "Book" 
// с соответствующим идентификатором. Этот метод позволяет найти книгу по ее идентификатору.

// "findAll()": Этот метод возвращает список объектов типа "Book", содержащий все доступные книги. 
// Этот метод позволяет получить все книги из хранилища.