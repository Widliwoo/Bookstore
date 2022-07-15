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
public class Publishing extends IdentifiableEntity {

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String mainOfficeCity;
}
