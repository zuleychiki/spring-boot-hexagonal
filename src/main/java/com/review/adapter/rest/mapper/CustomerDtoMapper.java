package com.review.adapter.rest.mapper;

import com.review.adapter.rest.dto.out.CustomerResponse;
import com.review.domain.model.Customer;
import org.mapstruct.Mapping;

public interface CustomerDtoMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "orders", target = "orders")
    @Mapping(source = "email", target = "email")
    public CustomerResponse toCustomer(Customer customer);
}
