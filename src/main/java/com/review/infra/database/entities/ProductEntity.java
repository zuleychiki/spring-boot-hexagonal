package com.review.infra.database.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity {

    // Called DTOs

    @Id
    @SequenceGenerator(
            name = "product_id_sequence",
            sequenceName = "customer_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_id_sequence"
    )
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private Double price;

    @ManyToMany(mappedBy = "listProducts")
    private List<OrderEntity> listOrders;
}
