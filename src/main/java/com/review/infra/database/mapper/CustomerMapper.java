package com.review.infra.database.mapper;

import com.review.domain.model.Customer;
import com.review.infra.database.entities.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "id", target = "customerId")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "email", target = "email")
    CustomerEntity customerEntityToCustomer(Customer customer);

    @InheritInverseConfiguration
    Customer customerToCustomerEntity(CustomerEntity customerEntity);
}
