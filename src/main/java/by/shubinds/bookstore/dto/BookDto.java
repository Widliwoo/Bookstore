package by.shubinds.bookstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookDto {
    private String name;
    private String annotation;
    private BigDecimal price;
}
