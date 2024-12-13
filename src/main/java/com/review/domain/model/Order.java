package com.review.domain.model;

import com.review.infra.database.entities.ProductEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class Order {

    private Integer id;
    private LocalDateTime purchaseDate;
    private Integer customerId;
    private List<ProductEntity> listProducts;
}
