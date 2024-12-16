package com.review.adapter.rest.mapper;

import com.review.adapter.rest.dto.out.CustomerResponse;
import com.review.domain.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerDtoMapper {

    //Uso el @Mapping cuando el nombre del atributo es diferente
    //@Mapping(source = "birthDate", target = "bornDate")
    public CustomerResponse toCustomerResponse(Customer customer);
}
