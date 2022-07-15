package by.shubinds.bookstore.specification;

import by.shubinds.bookstore.entity.Book;
import by.shubinds.bookstore.filter.BookFilter;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationHelper {
    public static Specification<Book> specification(BookFilter filter) {
        Specification<Book> spec = new NoOpSpecification<>();
        if (filter.getName() != null && !filter.getName().isBlank()) {
            spec = spec.and(new BookByNameSpecification(filter.getName()));
        }
        if (filter.getDescriptionPart() != null && !filter.getDescriptionPart().isBlank()) {
            spec = spec.and(new BookByDescriptionSpecification(filter.getDescriptionPart()));
        }
        if (filter.getPriceFrom() != null) {
            spec = spec.and(new BookByPriceLowSpecification(filter.getPriceFrom()));
        }
        if (filter.getPriceTo() != null) {
            spec = spec.and(new BookByPriceHighSpecification(filter.getPriceTo()));
        }
        return spec;
    }
}
