package ru.itgirls.jdbctest.repository;
import ru.itgirls.jdbctest.model.Book;
import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookByID(Long id);
}
