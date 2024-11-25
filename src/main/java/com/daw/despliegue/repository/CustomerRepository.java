package com.daw.despliegue.repository;

import com.daw.despliegue.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de la entidad Customer
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
