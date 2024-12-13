package com.review.adapter.rest.dto.in;

import com.review.domain.model.Order;

import java.time.LocalDateTime;
import java.util.List;

public class CustomerRequest {

    private String name;
    private String lastName;
    private String email;
    private LocalDateTime birthDate;
    private List<Order> orders;
}
