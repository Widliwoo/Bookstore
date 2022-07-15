package by.shubinds.bookstore.mapper;

import by.shubinds.bookstore.dto.BookDto;
import by.shubinds.bookstore.entity.Book;
import org.mapstruct.Mapper;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface BookMapper {
    default List<BookDto> map(List<Book> books) {
        if (books == null) {
            return Collections.emptyList();
        }
        return books.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }

    BookDto map(Book book);
}
