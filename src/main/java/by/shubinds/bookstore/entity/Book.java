package by.shubinds.bookstore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;


@Entity
@Getter
@Setter
@FieldNameConstants
public class Book extends IdentifiableEntity {

    @Column
    private String name;

    @Column
    private String annotation;

    @Column
    private BigDecimal price;

    @ManyToOne
    private Author author;

    @OneToOne
    private Publishing publishing;
}
