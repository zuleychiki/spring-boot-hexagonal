package com.review.infra.database.repositories;

import com.review.infra.database.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

    // Puedo extender también de una interfaz con funciones adicionales
    // Y su correspondiente clase que lo implementa
}
