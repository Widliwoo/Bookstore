package by.shubinds.bookstore.specification;

import by.shubinds.bookstore.entity.IdentifiableEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class NoOpSpecification<T extends IdentifiableEntity> implements Specification<T> {
    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.greaterThan(root.get(IdentifiableEntity.Fields.id), -1);
    }
}
