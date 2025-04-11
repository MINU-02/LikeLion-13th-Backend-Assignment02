package com.likelion.springprac.customer.application;

import com.likelion.springprac.customer.domain.Customer;
import com.likelion.springprac.customer.domain.CustomerRepository;
import com.likelion.springprac.customer.api.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private static Long sequence = 0L;

    public void saveCustomer(CustomerDto requestDto) {
        Customer customer = Customer.builder()
                .id(++sequence)
                .name(requestDto.name())
                .age(requestDto.age())
                .build();

        customerRepository.save(customer);
    }

    public CustomerDto findCustomerById(Long id) {
        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            throw new IllegalArgumentException("해당하는 고객이 없습니다. id = " + id);
        }
        return toDto(customer);
    }

    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Customer updateCustomerById(Long id, CustomerDto requestDto) {
        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            throw new IllegalArgumentException("해당하는 고객이 없습니다. id = " + id);
        }

        customer.update(requestDto.name(), requestDto.age());
        customerRepository.updateById(id, customer);
        return customer;
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    private CustomerDto toDto(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .name(customer.getName())
                .age(customer.getAge())
                .build();
    }
}
