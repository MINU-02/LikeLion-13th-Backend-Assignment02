package com.likelion.springprac.customer.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemoryCustomerRepository implements CustomerRepository {

    private static final Map<Long, Customer> database = new HashMap<>();

    @Override
    public void save(Customer customer) {
        database.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Customer> findAll() {
        return database.values().stream().toList();
    }

    @Override
    public void updateById(Long id, Customer customer) {
        database.put(id, customer);
    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);
    }
}
