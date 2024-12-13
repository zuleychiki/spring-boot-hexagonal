package com.review.adapter.rest.dto.out;

import com.review.domain.model.Order;

import java.time.LocalDateTime;
import java.util.List;

public class CustomerResponse {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime birthDate;
    private List<Order> orders;
}
