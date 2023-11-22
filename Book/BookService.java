package UnitTestHW4.Book;

import java.util.List;
// Здесь импортируется класс "List" из пакета "java.util", который используется для работы с коллекциями.


public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBookById(String id) {
        return bookRepository.findById(id);
    }
// "findBookById(String id)": Этот метод принимает идентификатор книги в качестве параметра и использует репозиторий книг
//  для поиска книги по этому идентификатору. Он возвращает объект типа "Book" - найденную книгу.
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
// "findAllBooks()": Этот метод использует репозиторий книг для получения всех доступных книг. 
// Он возвращает список объектов типа "Book", содержащий все книги.
}