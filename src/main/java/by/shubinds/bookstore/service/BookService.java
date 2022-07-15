package by.shubinds.bookstore.service;

import by.shubinds.bookstore.entity.Book;
import by.shubinds.bookstore.filter.BookFilter;
import by.shubinds.bookstore.repository.BookRepository;
import by.shubinds.bookstore.specification.SpecificationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {


    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private final BookRepository bookRepository;

    public List<Book> findByFilter(BookFilter filter, Pageable pageable) {
        Page<Book> books = bookRepository.findAll(SpecificationHelper.specification(filter), pageable);
        return books.isEmpty() ? Collections.EMPTY_LIST : books.getContent();
    }
}
