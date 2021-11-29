package com.sqlviaspringdatajpa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Locale;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;

    private Integer price;

    public Product(String productName, Integer price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.getProductName());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
