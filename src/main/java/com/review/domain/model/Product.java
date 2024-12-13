package com.review.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Product {

    private Long id;
    private String productName;
    private Double price;
}
