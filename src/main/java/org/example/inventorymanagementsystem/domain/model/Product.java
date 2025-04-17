package org.example.inventorymanagementsystem.domain.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.inventorymanagementsystem.domain.enums.Category;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = {"category"})
@Table(name = "products")
public class Product extends BaseEntity<Long>{

    @Column(unique = true, nullable = false)
    private String sku;

    @Column(nullable = false)
    private String name;
    private String description;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Category category;
    private int stockQuantity;
    private int reorderThreshold;
}
