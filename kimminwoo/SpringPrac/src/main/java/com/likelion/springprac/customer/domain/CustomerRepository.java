package com.likelion.springprac.customer.domain;

import java.util.List;

public interface CustomerRepository {

    void save(Customer customer);
    Customer findById(Long id);
    List<Customer> findAll();
    void updateById(Long id, Customer customer);
    void deleteById(Long id);
}
