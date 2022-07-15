package by.shubinds.bookstore.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@FieldNameConstants
public class Author extends IdentifiableEntity {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String middleName;

    @Column
    private String biography;

}
