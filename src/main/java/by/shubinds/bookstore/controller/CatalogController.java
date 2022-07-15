package by.shubinds.bookstore.controller;

import by.shubinds.bookstore.entity.Book;
import by.shubinds.bookstore.filter.BookFilter;
import by.shubinds.bookstore.mapper.BookMapper;
import by.shubinds.bookstore.service.BookService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public String getCatalog(Model model) {
        Pageable pageable = PageRequest.of(0, 20, Sort.by(Sort.Direction.ASC, Book.Fields.name));
        List<Book> books = bookService.findByFilter(BookFilter.empty(), pageable);
        BookMapper mapper = Mappers.getMapper(BookMapper.class);
        model.addAttribute("books", mapper.map(books));
        return "catalog";
    }
}
