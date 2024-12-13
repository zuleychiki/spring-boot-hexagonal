package com.review.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class Customer {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime birthDate;
    private List<Order> orders;
}
