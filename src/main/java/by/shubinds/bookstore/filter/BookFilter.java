package by.shubinds.bookstore.filter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookFilter {
    private String name;
    private Integer priceFrom;
    private Integer priceTo;
    private String descriptionPart;

    public static BookFilter empty() {
        return new BookFilter();
    }
}
