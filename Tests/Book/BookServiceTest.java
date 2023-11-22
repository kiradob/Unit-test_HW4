package UnitTestHW4.Tests.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import UnitTestHW4.Book.BookRepository;
import UnitTestHW4.Book.InMemoryBookRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);
    }
// Внутри метода "setUp()" создается мок-объект "InMemoryBookRepository" с помощью Mockito, а затем он используется 
// для создания экземпляра "bookService".

    @Test
    public void testFindBookById() {
        Book book = new Book("1", "1984", "Джордж Оруэлл");
        when(bookRepository.findById("1")).thenReturn(book);
        Book testBook = bookService.findBookById("1");
        assertEquals(book, testBook);
        verify(bookRepository, times(1)).findById("1");
    }
// Это тестовый метод, который проверяет, правильно ли метод "findBookById()" класса "BookService" возвращает книгу 
// по заданному идентификатору. 
// В тесте создается объект "Book" и он возвращается, когда вызывается метод "findById()" мок-объекта "bookRepository". 
// Затем происходит сравнение возвращенного объекта с ожидаемым результатом, используя метод "assertEquals()". 
// Помле проверяется что метод "findById()" был вызван только один раз с заданным идентификатором, используя метод "verify()".
    @Test
    public void testFindAllBook() {
        Book book1 = new Book("1", "Ночь в Лиссабоне", "Эрих Мария Ремарк");
        Book book2 = new Book("2", "Возвращение", "Эрих Мария Ремарк");
        List<Book> books = new ArrayList<>(List.of(book1, book2));
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> listOfBooks = bookService.findAllBooks();
        assertEquals(books, listOfBooks);
        verify(bookRepository, times(1)).findAll();
    }
// "testFindAllBook()": Это тестовый метод, который проверяет, правильно ли метод "findAllBooks()" класса "BookService" 
// возвращает список всех книг. 
}