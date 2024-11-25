package com.daw.despliegue.service;

import com.daw.despliegue.exception.ResourceNotFoundException;
import com.daw.despliegue.model.Customer;
import com.daw.despliegue.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        var customers = customerRepository.findAll();

        if (customers.isEmpty()) {
            throw new ResourceNotFoundException("No se han encontrado clientes registrados");
        }
        return customers;
    }
}
